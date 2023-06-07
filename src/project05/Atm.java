package project05;

import java.util.Scanner;

public class Atm {

    /*
        ATM
       Ask the user for the card number and password for login,
       If any one is entered incorrectly, ask again.
       Even if the card number enters with spaces in between, accept if correct.
       If the card number and password are confirmed, print the actions that the user can do on the screen,

       In the menu list, there will be balance query, deposit, withdrawal,
       money transfer, password change and exit operations.

       Larger money cannot be withdrawn from the existing balance in the withdrawal and money transfer process,

       In the money transfer process, the desired iban must start with TR and have 26 characters in total,
       if not, return to the menu screen.

       After confirming the current password in the password change process, the password must be changed,
    */

    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 50000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {

        /*
        Ask the user for the card number and password for login,
        If you enter any of them wrong, ask again.
        Even if the card number enters with spaces in between, accept it if it is correct.
        If the card number and password are confirmed, print the actions that the user can do on the screen,
         */

        System.out.print("KART NUMARASINI GİRİNİZ: ");
        String kKartNo = scan.nextLine().replace(" ", "");
        System.out.print("ŞİFRENİZİ GİRİNİZ: ");
        String kSifre = scan.next();

        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)) {
            menu();
        } else {
            System.out.println("KULLANICI ADI VEYA ŞİFRE YANLIŞ GİRİLDİ...");
            scan.nextLine(); // dummy ----> we used it to prevent the error
                             // when the scanner object is used repeatedly
            giris();
        }

    }

    private static void menu() {
        //In the menu list, there will be balance query, deposit, withdrawal,
        // money transfer, password change and exit operations.
        System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ:\n" +
                                        "1. BAKİYE SORGULAMA\n" +
                                        "2. PARA YATIRMA\n" +
                                        "3. PARA ÇEKME\n" +
                                        "4. PARA GÖNDERME\n" +
                                        "5. ŞİFRE DEĞİŞTİRME\n" +
                                        "6. ÇIKIŞ\n" +
                                        "SEÇİMİNİZ: ");

        int secim = scan.nextInt();

        switch (secim) {
            case (1): {
                //BALANCE QUERY
                bakiyeSorgula();
            }
            case (2): {
                //SEND MONEY
                System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);

            }
            case (3): {
                //WITHDRAW MONEY
                // In the withdrawal process, a large amount of money cannot be withdrawn from the existing balance.
                System.out.print("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);

            }
            case (4): {

                // SEND MONEY

                /*
                Larger money cannot be withdrawn from the existing balance in the money transfer process,
                In the money transfer process, the desired iban must start with TR and have 26 characters in total,
                if not, return to the menu screen.
                 */

                paraGonderme();
                break;

            }
            case (5): {
                // After confirming the current password in the password change process, the password should be changed
                sifreDegistir();
                break;
            }
            case (6): {
                System.out.println("GÜLE GÜLE...");
                System.exit(0);
            }
            default: {
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }
        }

    }
    private static void sifreDegistir() {

        System.out.print("ESKİ ŞİFRENİZİ GİRİNİZ: ");
        String eSifre = scan.next();

        if (eSifre.equals(sifre)) {
            System.out.print("YENİ ŞİFRE GİRİNİZ: ");
            sifre = scan.next();
            scan.nextLine();
            giris();
        } else {
            System.out.println("HATALI GİRİŞ YAPTINIZ...");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {

       /*
          Larger money cannot be withdrawn from the existing balance in the money transfer process,
          In the money transfer process, the desired iban must start with
          TR and have 26 characters in total, if not, return to the menu screen.
       */

        scan.nextLine();// dummy
        System.out.print("PARA GÖNDERMEK İSTEDİĞİNİZ İBAN NUMARASINI GİRİNİZ: ");
        String iban = scan.nextLine().toUpperCase().replace(" ", "");

        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.print("GÖNDERMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
            double miktar = scan.nextDouble();

            if (miktar <= bakiye) {
                System.out.println(miktar + " TL " + iban + " NOLU HESABA GÖNDERİLDİ");
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("GÖNDERMEK İSTEDİĞİNİZ TUTARA SAHİP DEĞİLSİNİZ...");
                bakiyeSorgula();
            }
        }
    }

    private static void paraCekme(double miktar) {

        // For withdrawals and money transfers, larger money cannot be withdrawn from the existing balance.

        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARA SAHİP DEĞİLSİNİZ...");
            bakiyeSorgula();
        }
    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("BAKİYENİZ: " + bakiye);
        menu();
    }
}
