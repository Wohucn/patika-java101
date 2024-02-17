import java.util.Scanner;

public class Ortalama_Hesaplayici {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz ?: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz ?: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz ?: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuz ?: ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuz ?: ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuz ?: ");
        muzik = inp.nextInt();

        //Ortalamayı hesaplar
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız " + ortalama);

        //Geçtin veya kaldın mesajı
        String mesaj = ortalama < 50 ? "Sınıfta Kaldın" : "Sınıfı geçtin";
        System.out.println(mesaj);

    }
}