package Artik_Yili_Hesaplayici;

import java.util.Scanner;

public class Artik_Yili_Hesaplayici {
    public static void main(String[] args) {
        int yil;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Herhangi bir yıl giriniz: ");
        yil = girdi.nextInt();

        if (yil % 4 == 0)
        {
            if (yil % 100 == 0)
            {
                if (yil % 400 == 0)
                {
                    System.out.println(yil + " Bir artık yıldır.");
                }
                else
                {
                    System.out.println(yil + " Bir artık yıl değildir.");
                }
            }
            else
            {
                System.out.println(yil+ " Bir artık yıldır.");
            }
        }
        else
        {
            System.out.println(yil + " Bir artık yıl değildir.");
        }

    }
}
