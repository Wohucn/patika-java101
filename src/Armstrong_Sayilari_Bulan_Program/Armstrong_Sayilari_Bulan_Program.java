package Armstrong_Sayilari_Bulan_Program;

import java.util.Scanner;

public class Armstrong_Sayilari_Bulan_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = sc.nextInt(), tempNumber = number;
        int basNamber = 0, basValue, basPow;
        int result = 0;

        //Basamak Sayısını bulur.
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNamber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNamber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if (number == result) {
            System.out.println("Bu bir Armstrong sayısıdır: " + result);
        } else {
            System.out.println("Girdiğiniz sayı Armstrong sayısı değildir: " + result);
        }
    }
}
