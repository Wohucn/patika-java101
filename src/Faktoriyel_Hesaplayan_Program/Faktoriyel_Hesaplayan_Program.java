package Faktoriyel_Hesaplayan_Program;

import java.util.Scanner;

public class Faktoriyel_Hesaplayan_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, total = 1;
        System.out.print("Faktöriyel Sayısı: ");
        x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}
