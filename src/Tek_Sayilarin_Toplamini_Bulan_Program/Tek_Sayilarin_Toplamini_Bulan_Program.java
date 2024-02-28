package Tek_Sayilarin_Toplamini_Bulan_Program;

import java.util.Scanner;

public class Tek_Sayilarin_Toplamini_Bulan_Program {
    public static void main(String[] args) {

        int number, total = 0;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        } while (number > 0);
        System.out.println("Toplam: " + total);
    }
}
