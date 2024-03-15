package Yildizlar_ile_Elmas;

import java.util.Scanner;

public class Yildizlar_ile_Elmas {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();

        for (int i = 0; i <= sayi; i++) {
            for (int b = 1; b <= sayi - i; b++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * i + 1); y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = sayi - 1; i >= 0; i--) {
            for (int b = 0; b <= sayi - i - 1; b++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * i + 1); y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


