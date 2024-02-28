package Odev_Tek_Sayi_GirileneKadara;

import java.util.Scanner;

public class Odev_Tek_Sayi_GirileneKadara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if ((number % 2 == 0) || (number % 4 == 0)) {
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println(total);
    }
}
