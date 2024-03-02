package Uslu_Sayi_Hesaplayan_Program;

import java.util.Scanner;

public class Uslu_Sayi_Hesaplayan_Program {
    public static void main(String[] args) {
        int x, y;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        x = girdi.nextInt();
        System.out.print("Üs olacak sayı: ");
        y = girdi.nextInt();
        int total = 1;

        for (int i = 1; i <= y; i++) {
            total *= x;
        }
        System.out.println("Cevap: " + total);
    }
}
