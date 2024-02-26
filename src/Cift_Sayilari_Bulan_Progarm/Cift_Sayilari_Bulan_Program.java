package Cift_Sayilari_Bulan_Progarm;

import java.util.Scanner;

public class Cift_Sayilari_Bulan_Program {
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = girdi.nextInt();
        for (int i = 0; i<=sayi; i++){
            if (i % 2==0){
                System.out.println(i);
            }
        }
    }
}
