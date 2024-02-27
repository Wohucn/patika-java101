package Cift_Sayilari_Bulan_Progarm;

import java.util.Scanner;

public class Cift_Sayilari_Bulan_Program {
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = girdi.nextInt();

        int a = 0, toplam = 0, adet = 0;
        while (a <= sayi) {
            if (a % 3 == 0 && a % 4 == 0) {
                toplam += a;
                adet++;
            }
            a++;
        }
        System.out.println("Ortalama: " + toplam / adet);
    }
}
