package project02;

import java.util.Scanner;

public class Supermarket {

    static Scanner scan = new Scanner(System.in);

    static String urunAdi;
    static String sepet = "";
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun = false;

    /*
         ==================== PROJECT =====================
         When you enter the program for the first time, you will be greeted with a menu and these options:
       1 DELI PRODUCTS
       2 Greengrocery Products
       3 MARKETS
         By Choice,
       4-list the products and
       5-come the prices

     */

    public static void main(String[] args) {

        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("========= WISE Market'e Hos Geldiniz =========");
        System.out.println("----- MENU -----");
        System.out.println("Lutfen Alisveris yapmak istediginiz reyonu seciniz");
        System.out.println("1- Manav\n2- Sarkuteri\n3- Market\n4- Fis Yazdir\n5- Cikis");

        int secim = scan.nextInt();

        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Hatali Tuslama Yaptiniz");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;

                case 2:
                    sarkuteri();
                    break;

                case 3:
                    market();
                    break;

                case 4:
                    fisYazdir();
                    break;

                case 5:
                    cikis();
                    break;

                default:
            }
        }
    }

    private static void manav() {
        System.out.println("Lutfen alacaginiz urun kodunu giriniz \n1- Patates(kg12) \n2- Sogan(kg15) " +
                "\n3- Elma(kg15) \n4- Portakal(kg20) \n5- Ananas(kg30)");
        while (!ekUrun) {
            urunKodu = scan.nextInt();

            if (urunKodu >= 1 && urunKodu <= 5) {
                System.out.println("Kac Kg Alirsiniz?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 1:
                        urunAdi = "Patates";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " Kg " + urunAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 2:
                        urunAdi = "Sogan";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " Kg " + urunAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 3:
                        urunAdi = "Elma";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " Kg " + urunAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 4:
                        urunAdi = "Portakal";
                        urunFiyati = 20;
                        System.out.println(urunAdedi + " Kg " + urunAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 5:
                        urunAdi = "Ananas";
                        urunFiyati = 30;
                        System.out.println(urunAdedi + " Kg " + urunAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    default:
                }
                urunFiyati = urunFiyati * urunAdedi; // buraya hafizaya kaydediyoruz
                toplam += urunFiyati;
                System.out.println("Sepet Turtari : " + toplam);
                sepet += urunAdi + ": " + urunFiyati + "TL'dir.";
                System.out.println("Baska urun alamak isterseniz urun kodunu giriniz...\nAna menuye donmek icin 0'a basiniz");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void sarkuteri() {
        System.out.println("Lutfen alacaginiz urun kodunu giriniz \n1- Peynir(kg120) \n2- Zeytin(kg80) " +
                "\n3- Ceviz(kg150) \n4- Sucuk(kg300) \n5- Bal(kg300)");

        while (!ekUrun) {
            urunKodu = scan.nextInt();

            if ((urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Kac kg istersiniz?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 1:
                        urunAdi = "Peynir";
                        urunFiyati = 120;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 2:
                        urunAdi = "Zeytin";
                        urunFiyati = 80;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 3:
                        urunAdi = "Ceviz";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 4:
                        urunAdi = "Sucuk";
                        urunFiyati = 300;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 5:
                        urunAdi = "Bal";
                        urunFiyati = 300;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;

                    default:
                }
                urunFiyati = urunFiyati * urunAdedi;
                toplam += urunFiyati;
                System.out.println("Sepet tutari : "+ toplam);
                sepet += urunAdi + " : "+ urunFiyati + " Tl'dir";
                System.out.println("Baska urun alamak isterseniz urun kodunu giriniz...\nAna menuye donmek icin 0'a basiniz");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void market() {
        System.out.println("Lutfen alacaginiz urun kodunu giriniz \n1- Cikolata(5Tl) \n2- Meyve Suyu(20Tl) " +
                "\n3- Makarna(12Tl) \n4- Deterjan(160Tl) \n5- Su(25Tl)");

        while (!ekUrun){
            urunKodu = scan.nextInt();

            if ((urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Kac adet istersiniz?");
                urunAdedi = scan.nextInt();

                switch (urunKodu){
                    case 1:
                        urunAdi = "Cikolata";
                        urunFiyati = 5;
                        System.out.println(urunAdedi + " adet" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 2:
                        urunAdi = "Meyve Suyu";
                        urunFiyati = 20;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 3:
                        urunAdi = "Makarna";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 4:
                        urunAdi = "Deterjan";
                        urunFiyati = 160;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 5:
                        urunAdi = "Su";
                        urunFiyati = 25;
                        System.out.println(urunAdedi + " Kg" + urunAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;

                    default:
                }
                urunFiyati = urunFiyati * urunAdedi;
                toplam += urunFiyati;
                System.out.println("Sepet tutari : "+ toplam);
                sepet += urunAdi + " : "+ urunFiyati + " Tl'dir";
                System.out.println("Baska urun alamak isterseniz urun kodunu giriniz...\nAna menuye donmek icin 0'a basiniz");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void fisYazdir() {
    }

    private static void cikis() {

    }
}
