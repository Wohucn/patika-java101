import java.util.Scanner;

public class KDV_Tutari_Hesaplayici {
    public static void main(String[] args) {

        double tutar, kdvOrani, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar = inp.nextDouble();
        kdvOrani = tutar < 1000 ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.print("KDV'li Tutar: " + kdvliTutar);

    }
}