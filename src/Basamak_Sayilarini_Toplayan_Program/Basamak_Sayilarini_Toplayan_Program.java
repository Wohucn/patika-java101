package Basamak_Sayilarini_Toplayan_Program;

import java.util.Scanner;

public class Basamak_Sayilarini_Toplayan_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, total = 0, basNumber;

        //Kullanıcıdan sayı girmesini ister
        System.out.print("Bir sayı giriniz: ");
        number = sc.nextInt();

        while (number != 0) {
            basNumber = number % 10;
            total += basNumber;
            number /= 10;
        }
        System.out.println(total);
    }
}
