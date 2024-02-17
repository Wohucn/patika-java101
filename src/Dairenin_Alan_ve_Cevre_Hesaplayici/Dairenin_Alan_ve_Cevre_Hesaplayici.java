import java.util.Scanner;

public class Dairenin_Alan_ve_Cevre_Hesaplayici {
    public static void main(String[] args) {

        //Değişkeni oluşturdum
        double yaricap, pi = 3.14159265359, alan, cevre, aci, dilimAlan;

        Scanner girdi = new Scanner(System.in);

        //Kullanıcıdan yarı çapı girmesini istedim
        System.out.print("Yarı Çapını Giriniz: ");
        yaricap = girdi.nextDouble();

        //Dairenin çevresini hesaplar
        cevre = 2 * pi * yaricap;
        System.out.println("Dairenin Çevresi: " + cevre);

        //Dairenin alanını hesaplar
        alan = pi * yaricap * yaricap;
        System.out.println("Dairenin Alanı: " + alan);

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        aci = girdi.nextDouble();
        dilimAlan = (pi * (yaricap * yaricap) * aci) / 360;
        System.out.println(dilimAlan);


    }
}