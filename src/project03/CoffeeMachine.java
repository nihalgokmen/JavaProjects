package project03;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String hangiKahve = "";
        String boyut = "";
        String sut="";

        /// 1. Condition

        int flag = 0;
        while (flag == 0) {
            flag = 0;
            System.out.println("Hangi Kahveyi istersiniz?\n" +
                    "  1.Türk kahvesi\n" +
                    "  2.Filtre Kahve\n" +
                    "  3.Espresso");
            hangiKahve = scan.nextLine();

            if (hangiKahve.equalsIgnoreCase("Türk kahvesi")) {
                System.out.println(hangiKahve + " hazirlaniyor.");
                flag++;

            } else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
                System.out.println(hangiKahve + " hazirlaniyor.");
                flag++;

            } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println(hangiKahve + " hazirlaniyor.");
                flag++;

            } else {
                System.out.println("Hatali tuslama yaptiniz");
            }
        }

        /// 2. Condition

        flag = 0;
        while (flag == 0) {
            flag = 0;

            System.out.println("Süt Ister misiniz ? (Evet veya Hayır olarak cevaplayınız):  ");
            sut = scan.next();

            if (sut.equalsIgnoreCase("evet")) {
                sut="sütlü";
                System.out.println(" Süt ekleniyor...");
                flag++;
            } else if (sut.equalsIgnoreCase("hayir")) {
                sut="sütsüz";
                System.out.println("Süt eklenmiyor ");
                flag++;
            } else {
                System.out.println("hatalı tuslama yaptınız.");
            }


        }

        /// 3. Condition

        flag = 0;
        while (flag == 0) {

            flag = 0;
            System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
            String seker = scan.next();

            if (seker.equalsIgnoreCase("EVET")) {

                System.out.println("Kac Seker Olsun?");
                int kasSeker = scan.nextInt();

                System.out.println(kasSeker + " Seker Ekleniyor");
                flag++;

            } else if (seker.equalsIgnoreCase("HAYIR")) {

                System.out.println("Seker Eklenmiyor");
                flag++;
            } else {
                System.out.println("hatalı tuslama yaptınız.");
            }
        }


        //// 4. Condition

        Scanner scan1 = new Scanner(System.in);

        flag = 0;
        while (flag == 0) {
            flag = 0;
            System.out.println("Kahveniz Hangi Boyutta Olsun?" +
                    "\n(Buyuk boy - Orta boy - Kucuk boy,  olarak giriniz)");
            boyut = scan1.nextLine();

            if (boyut.equalsIgnoreCase("Buyuk Boy")) {

                System.out.println("Kahveniz " + boyut + " hazirlaniyor...");
                flag++;

            } else if (boyut.equalsIgnoreCase("Orta Boy")) {

                System.out.println("Kahveniz " + boyut + " hazirlaniyor...");
                flag++;

            } else if (boyut.equalsIgnoreCase("Kucuk Boy")) {

                System.out.println("Kahveniz" + boyut + " hazirlaniyor...");
                flag++;
            } else {
                System.out.println("hatalı tuslama yaptınız.");
            }
        }

        //// The END

        System.out.println(hangiKahve + " " + boyut +" "+ sut + " hazirdir.");

    }
}
