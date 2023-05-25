package project01;

import java.util.Scanner;

public class PasswordControl {

    public static void main(String[] args) {

        /*
       Project - Ask the user to enter a password. Entered password according to the following conditions
               check and print the errors in the password.
               Repeat this process until the user enters a valid password and
               When you enter the password, print "Your Password is Accepted".
               - Password must contain lowercase letters
               - Password must contain capital letters
               - Password must contain special characters
               - Password must be at least 8 characters.
         */

        Scanner scan = new Scanner(System.in);

        int flag = 0;
        int dogru = 0;

        do {
            System.out.println("Lutfen sifrenizi giriniz: ");
            String sifre = scan.nextLine();
            flag = 0;
            dogru = 0;

            for (int i = 0; i < sifre.length(); i++) {
                if (((sifre.charAt(i)) <= 'z' && sifre.charAt(i) >= 'a')) {
                    flag++;
                }
            }
            if (flag > 0) {
                dogru++;
            } else {
                System.out.println("sifre kucuk harf icermelidir");

            }

            flag=0;
            for (int j = 0; j < sifre.length(); j++) {
                if (((sifre.charAt(j)) <= 'Z' && sifre.charAt(j) >= 'A')) {
                    flag++;
                }
            }
            if (flag > 0) {
                dogru++;
            } else {
                System.out.println("sifre buyuk harf icermelidir");

            }

            if ((sifre.length() >= 8)) {
                dogru++;
            } else if (sifre.length()<8){
                System.out.println("sifre 8 karakter icermelidir");
            }


        } while (dogru != 3) ;


        if (dogru == 3) {
            System.out.println("sifre kabul edilmistir");
        }
    }
}
