package Sayilari_Buyukten_Kucuge_Siralama;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sayilari_Buyukten_Kucuge_Siralama {
    public static void main(String[] args) {

        int a, b, c;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. sayı: ");
        a = girdi.nextInt();

        System.out.print("2. sayı: ");
        b = girdi.nextInt();

        System.out.print("3. sayı: ");
        c = girdi.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("A > B > C ");
            } else {
                System.out.println("A > C > B");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("B > A > C ");
            } else {
                System.out.println("B > C > A");
            }
        } else {
            if (a > b) {
                System.out.println("C > A > B ");
            } else {
                System.out.println("C > B > A");
            }
        }
    }
}
