package project04;

import java.util.Random;

public class CreateTcNo {

    // TC ID number
    // 1 - last digit must be even.
    // 2 - cannot start with the number 0.
    // 3 - the ones digit of the sum of the first 10 digits gives the 11th digit.
    // 4 - 7 times the sum of 1, 3, 5, 7, and 9th digits 2, 4, 6
    // the ones digit of the sum of 9 times the sum of the 8th digit and the 10th digit;
    // 5 - The ones digit of 8 times the sum of 1, 3, 5, 7 and 9 gives the 11th digit.

    static Random rnd = new Random();

    public static void main(String[] args) {
        tcNoUret();
    }

    private static void tcNoUret() {

        int tcNo[] = new int[11];
        int tekToplam = 0, ciftToplam = 0, ilkOnToplam = 0;
        boolean kontrol=false;
        while (!kontrol) {

            for (int i = 0; i <= 9; i++) {
                tcNo[i] = rnd.nextInt(10);
            }

            for (int i = 0; i <= 8; i += 2) {   //
                tekToplam += tcNo[i];
            }
            for (int i = 1; i <= 7; i += 2) {   //
                ciftToplam += tcNo[i];
            }

            //1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı
            tcNo[9] = ((tekToplam * 7) + (ciftToplam * 9)) % 10;

            for (int i = 0; i < 10; i++) {
                ilkOnToplam += tcNo[i];
            }
            //son rakamı çift olmak zorundadır,0 ile baslayamaz,ilk 10 rakamın toplamının birler basamağı,1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
            if ((ilkOnToplam % 10) == (tekToplam * 8) % 10 && (ilkOnToplam % 10)%2== 0 && tcNo[0]!=0) {
                tcNo[10] = ilkOnToplam % 10;
                kontrol=true;

            }else {
                kontrol=false;
            }
        }

        for (int each : tcNo) {
            System.out.print(each);
        }
    }
}
