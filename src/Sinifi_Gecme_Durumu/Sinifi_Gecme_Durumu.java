import java.util.Scanner;

public class Sinifi_Gecme_Durumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = girdi.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = girdi.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = girdi.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = girdi.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = girdi.nextInt();

        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || turkce < 0 || turkce > 100 || kimya < 0 || kimya > 100 || muzik < 0 || muzik > 100) {
            System.out.println("Hatalı giriş");
        } else {
            int ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

            if (ortalama >= 55) {
                System.out.println(ortalama + " Ortalama ile sınıfı geçtiniz");
            } else {
                System.out.println(ortalama + " Ortalama ile sınıfta kaldınız");
            }
        }

    }
}

