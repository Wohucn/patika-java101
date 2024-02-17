import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, selectt;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        sayi1 = girdi.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        sayi2 = girdi.nextInt();

        System.out.println("Toplama ise 1 \n" + "Çıkarma ise 2 \n" + "Çarpma ise 3\n" + "Bölme ise 4");
        selectt = girdi.nextInt();

        switch (selectt) {
            case 1:
                System.out.println("İşlem sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("İşlem sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("İşlem sonucu: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("İşlem sonucu: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı Seçim!!");
        }
    }
}