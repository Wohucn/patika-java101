import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {

        System.out.println("Java101 Patikası\nBaşlıyoruzz...");

        //Çarpma İşlemi
        int numberOne = 20, numberTwo = 100;
        System.out.println("Çarpa İşleminin Sonucu: " + numberOne * numberTwo);

        // Dikdörtgen alan ve çevre hesaplama
        int kisaKenar = 10, uzunKenar = 20;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * kisaKenar + uzunKenar;
        System.out.println("Çevresi: " + cevre);
        System.out.println("Alanı: " + alan);

        // Byte, Short, Int ve Long Veri Tipleri
        byte vByte = 127;
        short vShort = 32767;
        int vInt = 2147483647;
        long vLong = 1000000000;
        System.out.println("vByte: " + vByte);
        System.out.println("vShort: " + vShort);
        System.out.println("vInt: " + vInt);
        System.out.println("vLong: " + vLong);

        //Float ve Double Veri Tipleri
        float vFloat = 3.14f;
        double vDouble = 3.15;
        System.out.println("vFloat: " + vFloat);
        System.out.println("vDouble: " + vDouble);

        //Char ve Boolean Veri Tipleri
        char vChar = 'J', v2Char = 'A', v3Char = 'V', v4Char = 'A';
        boolean vBoolean = true;
        boolean v2Boolean = false;
        System.out.println("vChar: " + vChar + v2Char + v3Char + v4Char);
        System.out.println("Doğru: " + vBoolean);
        System.out.println("Yanlış: " + v2Boolean);

        // String veri tipi
        String vStr = "Selam Millet";
        System.out.println("vStr: " + vStr);


        //Atama Operatörleri
        int a = 5, b = 5;
        b += a;
        b -= a;
        b *= a;
        System.out.println(b);

        //Karşılaştırma Operatörleri
        int c = 5, d = 5;
        boolean sonuc = (c == d);
        System.out.println("2 değer birbine eşitmi: " + sonuc);
        boolean sonuc2 = 1 != 9;
        System.out.println("İki değer birbirine eşit değilmi: " + sonuc2);
        boolean sonuc3 = 40 > 30;
        System.out.println("İlk değer ikinci değerden büyükmü: " + sonuc3);
        boolean sonuc4 = 30 < 40;
        System.out.println("İlk değer ikinci değerden küçükmü: " + sonuc4);
        boolean sonuc5 = 40 >= 10;
        System.out.println("İlk değer ikinci değerden büyük veya eşitmi: " + sonuc5);
        boolean sonuc6 = 10 <= 40;
        System.out.println("İlk değer ikinci değerden küçük veya eşitmi: " + sonuc6);

        //Mantıksal Operatörler
        int g = 5, n = 10;
        boolean kosul1 = g < n;
        boolean kosul2 = n > g;
        boolean kosul3 = kosul1 && kosul2;
        System.out.println("Koşul1 ve Koşul2 doğrumu: " + kosul3);

        boolean sonuc7 = ((g < n) || (n > g));
        System.out.println(sonuc7);

        //Koşul operatörleri
        String str2 = sonuc7 ? "Doğru" : "Yanlış";
        System.out.println(str2);

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        double sinav1, sinav2, sinav3;
        System.out.print("1.sınav notu: ");
        sinav1 = input.nextDouble();
        System.out.print("2.sınav notu: ");
        sinav2 = input.nextDouble();
        System.out.print("3.sınav notu: ");
        sinav3 = input.nextDouble();
        double ortalama = (sinav1 + sinav2 + sinav3) / 3;
        System.out.println(ortalama);


    }
}
