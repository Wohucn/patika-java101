package Yildizlar_ile_Ucgen_Yapimi;

import java.util.Scanner;

public class Yildizlar_ile_Ucgen_Yapimi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç satır olmasını istiyorsunuz: ");
        int n = girdi.nextInt();


        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}