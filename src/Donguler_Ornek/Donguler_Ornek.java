package Donguler_Ornek;
import java.util.Scanner;
public class Donguler_Ornek {
    public static void main(String[] args) {

        int sayi;
        Scanner girdi = new Scanner(System.in);


        System.out.println("For Döngüsü ile yapıldı");
        for (boolean a = true; a;){
            System.out.print("Sayı giriniz: ");
            sayi = girdi.nextInt();
            if (sayi < 0){
                a = false;
            }
        }

        System.out.println("-----------------------------");
        System.out.println("While Döngüsü ile yapıldı");
        System.out.print("Sayı giriniz: ");
        sayi = girdi.nextInt();
        while (sayi > 0){
            System.out.print("Sayı giriniz: ");
            sayi = girdi.nextInt();
        }


        System.out.println("-----------------------------");
        System.out.println("Do-While Döngüsü ile yapıldı");
        do {
            System.out.print("Sayı giriniz: ");
            sayi = girdi.nextInt();
        }while (sayi > 0);


    }
}
