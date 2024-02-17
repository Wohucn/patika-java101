import java.util.Scanner;

public class Manav_Kasa_Programi {
    public static void main(String[] args) {

        //Değişkenlerimi tanımladım
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, toplamTutar;
        Scanner girdi = new Scanner(System.in);

        //Kullanıcıdan kg değerlerini al
        System.out.print("Kaç kilo armut aldınız: ");
        double armutKg = girdi.nextDouble();
        System.out.print("Kaç kilo elma aldınız: ");
        double elmaKg = girdi.nextDouble();
        System.out.print("Kaç kilo domates aldınız: ");
        double domatesKg = girdi.nextDouble();
        System.out.print("Kaç kilo muz aldınız: ");
        double muzKg = girdi.nextDouble();
        System.out.print("Kaç kilo patlican aldınız: ");
        double patlicanKg = girdi.nextDouble();

        //Toplam fiyatı hesaplar
        toplamTutar = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.print("Toplam tutarınız: " + toplamTutar + (" TL"));
    }
}