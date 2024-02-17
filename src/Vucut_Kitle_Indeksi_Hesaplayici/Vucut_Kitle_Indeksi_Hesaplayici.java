import java.util.Scanner;

public class Vucut_Kitle_Indeksi_Hesaplayici {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz (Öreneğin: 1,80): ");
        boy = girdi.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = girdi.nextDouble();

        System.out.println("Vücut kitle indexiniz: " + kilo / (boy * boy));
    }
}