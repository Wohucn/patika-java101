import java.util.Scanner;

public class Taksi_Metre_Hesaplayici {
    public static void main(String[] args) {


        double toplamtutar, mesafe, km = 2.20, ilktutar = 10;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden yazınız: ");
        mesafe = girdi.nextDouble();
        toplamtutar = ilktutar + (mesafe * km);
        toplamtutar = (toplamtutar < 20) ? 20 : toplamtutar;
        System.out.print("Ödenecek Ücret: ");
        System.out.println(toplamtutar);
    }
}