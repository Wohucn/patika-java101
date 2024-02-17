import java.util.Scanner;

public class Dik_Ucgende_Hipotenus_Bulan_Program {
    public static void main(String[] args) {
        int aKenari, bKenari;
        double cKenari;
        Scanner inp = new Scanner(System.in);
        System.out.print("A kenarını giriniz: ");
        aKenari = inp.nextInt();
        System.out.print("B kenarını giriniz: ");
        bKenari = inp.nextInt();
        cKenari = Math.sqrt((aKenari * aKenari) + (bKenari * bKenari));
        System.out.print("Hipotenüs: " + cKenari);

    }
}