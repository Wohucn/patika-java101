package cin_zodyagi_hesaplayici;

import java.util.Scanner;

public class cin_zodyagi_hesaplayici {
    public static void main(String[] args) {

        int dogumTarihi, zodyagi;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Doğum Tarihinizi giriniz: ");
        dogumTarihi = girdi.nextInt();

        zodyagi = dogumTarihi % 12;

        System.out.println("Doğum tarihi bölümünden kalan sayı: " + zodyagi);

        switch (zodyagi) {
            case 0:
                System.out.println("Çin Zodyağınız: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağınız: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağınız: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağınız: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağınız: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağınız: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağınız: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağınız: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağınız: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağınız: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağınız: At");
                break;
            case 11:
                System.out.println("Çin Zodyağınız: Koyun");
                break;
        }

    }
}
