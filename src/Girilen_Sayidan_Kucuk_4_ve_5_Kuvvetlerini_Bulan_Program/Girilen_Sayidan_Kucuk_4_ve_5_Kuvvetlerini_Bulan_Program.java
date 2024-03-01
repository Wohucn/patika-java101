package Girilen_Sayidan_Kucuk_4_ve_5_Kuvvetlerini_Bulan_Program;

import java.util.Scanner;

public class Girilen_Sayidan_Kucuk_4_ve_5_Kuvvetlerini_Bulan_Program {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        sayi = sc.nextInt();

        System.out.println("4 in kuvetleri");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("5 in kuvetleri");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }

    }
}
