public class Karsilastirma_oparatorleri {
    public static void main(String[] args) {

        //Karşılaştırma oparatörleri
        int a = 10, b = 20, c = 10, d = 40;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);

        //Eşitmi (==) oparatörleri
        System.out.println("----------------------");
        System.out.print("A B'ye eşitmi: ");
        System.out.println(a == b);
        System.out.println("----------------------");
        System.out.print("A C'ye eşitmi: ");
        System.out.println(a == c);
        System.out.println("----------------------");

        //Eşit Değilmi (!=) oparatörleri
        System.out.print("A ile C eşit değilmi: ");
        System.out.println(a != c);
        System.out.println("----------------------");
        System.out.print("A ile D eşit değilmi: ");
        System.out.println(a != d);
        System.out.println("----------------------");

        //Büyüktür oparatörleri
        System.out.print("D A'dan büyükmü: ");
        System.out.println(d > a);
        System.out.println("----------------------");
        System.out.print("C D'den büyükmü: ");
        System.out.println(c > d);
        System.out.println("----------------------");

        //Küçüktür oparatörleri
        System.out.print("A D'den Küçükmü: ");
        System.out.println(a < d);
        System.out.println("----------------------");
        System.out.print("D C'den Küçükmü: ");
        System.out.println(d < c);
        System.out.println("----------------------");


    }
}
