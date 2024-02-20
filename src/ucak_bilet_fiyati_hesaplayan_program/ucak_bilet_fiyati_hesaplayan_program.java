package ucak_bilet_fiyati_hesaplayan_program;

import java.util.Scanner;

public class ucak_bilet_fiyati_hesaplayan_program {
    public static void main(String[] args) {
        double mesafe, indtutar, normtutar, yasind, gdind, tutar;

        int yas, yolculukTipi;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) giriniz: ");
        mesafe = girdi.nextInt();

        System.out.print("Yaşınızı yazınız: ");
        yas = girdi.nextInt();

        System.out.print("(1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = girdi.nextInt();

        if (yas > 0 && mesafe > 0 && yolculukTipi == 1 || yolculukTipi == 2) {
            if (yas < 12) {
                if (yolculukTipi == 1) {
                    normtutar = mesafe * 0.10;
                    yasind = normtutar * 0.50;
                    System.out.println("Toplam Tutar:" + yasind);
                } else if (yolculukTipi == 2) {
                    normtutar = mesafe * 0.10;
                    normtutar *= 2;
                    yasind = normtutar * 0.50;
                    gdind = yasind * 0.80;
                    System.out.println("Toplam Tutar:" + gdind);
                }
            }
            if (yas >= 12 && yas <= 24) {
                if (yolculukTipi == 1) {
                    normtutar = mesafe * 0.10;
                    yasind = normtutar * 0.90;
                    System.out.println("Toplam Tutar:" + yasind);
                } else if (yolculukTipi == 2) {
                    normtutar = mesafe * 0.10;
                    normtutar *= 2;
                    yasind = normtutar * 0.90;
                    gdind = yasind * 0.80;
                    System.out.println("Toplam Tutar:" + gdind);
                }
            }
            if (yas > 65) {
                if (yolculukTipi == 1) {
                    normtutar = mesafe * 0.10;
                    yasind = normtutar * 0.70;
                    System.out.println("Toplam Tutar:" + yasind);
                } else if (yolculukTipi == 2) {
                    normtutar = mesafe * 0.10;
                    normtutar *= 2;
                    yasind = normtutar * 0.70;
                    gdind = yasind * 0.80;
                    System.out.println("Toplam Tutar:" + gdind);
                }
            }
        } else {
            System.out.println("Hata !");
        }

    }
}
