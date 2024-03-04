package Harmonik_Sayilari_Bulan_Program;

import java.util.Scanner;

public class Harmonik_Sayilari_Bulan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        double sonuc = 0;

        for (int i = 1; i <= n; i++){
            sonuc += (1.0/i);
        }
        System.out.print(sonuc);
    }
}
