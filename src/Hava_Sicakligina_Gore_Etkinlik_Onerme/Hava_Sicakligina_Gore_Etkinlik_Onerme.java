package Hava_Sicakligina_Gore_Etkinlik_Onerme;

import java.util.Scanner;

public class Hava_Sicakligina_Gore_Etkinlik_Onerme {
    public static void main(String[] args) {

        int isi;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Hava kaç derece: ");
        isi = girdi.nextInt();

        if (isi < 5) {
            System.out.println("Tam kayak yapmalık hava");
        } else if (isi >= 5 && isi <= 25) {
            if (isi < 15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if (isi > 10){
                System.out.println("Pikniğe gidebilirsin");
            }
        } else if (isi > 40) {
            System.out.println("Dişarıya çıkma yanarsın");
        } else {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }

}
