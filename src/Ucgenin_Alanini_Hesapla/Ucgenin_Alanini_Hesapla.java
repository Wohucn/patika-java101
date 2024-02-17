import java.util.Scanner;

public class Ucgenin_Alanini_Hesapla {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenar uzunluğu: ");
        kenar1 = girdi.nextInt();
        System.out.print("2.kenar uzunluğu: ");
        kenar2 = girdi.nextInt();
        System.out.print("3.kenar uzunluğu: ");
        kenar3 = girdi.nextInt();

        int u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.print("Üçgenin alanı: " + alan);

    }
}