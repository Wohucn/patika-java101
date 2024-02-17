public class if_else {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;
        boolean karsilastirma = (a == b);
        //String str = karsilastirma ? "Eşit" : "Eşit değil";
        //System.out.println(str);

        if ((a < b) && (a < c)) {
            System.out.println("A en küçüktür.");
        } else if ((b < a) && (b < c)) {
            System.out.println("B en küçüktür.");
        } else if ((c < a) && (c < b)) {
            System.out.println("C en küçüktür.");
        }

    }
}
