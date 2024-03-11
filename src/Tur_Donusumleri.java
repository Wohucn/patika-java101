public class Tur_Donusumleri {
    public static void main(String[] args) {

        //String tipinden integere çevirme
        System.out.println("String tipinden integere çevirme");
        String a = "10";
        int i = Integer.valueOf(a);
        System.out.println(i + 8);
        System.out.println("--------------------------");

        //Integer tipinden Stringe çevirme
        System.out.println("Integer tipinden Stringe çevirme");
        int c = 10;
        String d = String.valueOf(c);
        System.out.println(d + 2);
        System.out.println("--------------------------");

        //Double tipinden Integer tipine çevirme
        System.out.println("Double tipinden Integer tipine çevirme");
        double h = 19.4;
        int j = (int) h;
        System.out.println(j);
        System.out.println("--------------------------");

        //Integer tipinden double tipine çevirme
        System.out.println("Integer tipinden double tipine çevirme");
        int t = 10;
        double u = (double) t;
        System.out.println(u + 0.1245125124521);
        System.out.println("--------------------------");

        //double tipinden longa çevirme
        System.out.println("double tipinden longa çevirme");
        float r = 1024.08412f;
        long g = (long) r;
        System.out.println(g);
        System.out.println("--------------------------");

        //Long tipinden Floata çevirme
        System.out.println("Long tipinden Floata çevirme");
        long p = 5L;
        float x = (float) p;
        System.out.println(x);
        System.out.println("--------------------------");

        //Long tipinden Stringe çevirme
        System.out.println("Long tipinden Stringe çevirme");
        long n = 8164L;
        String l = String.valueOf(n);
        System.out.println(l + 4 + 4 + 5 + 6 + 6 + 2222 + "-" + 22);
        System.out.println("--------------------------");

        //Float tipinden Stringe çevirme
        System.out.println("Float tipinden Stringe çevirme");
        float m = 70.813f;
        String q =String.valueOf(m);
        System.out.println(q + 84);
        System.out.println("--------------------------");

        //Byte tipinden Stirnge çevirme
        System.out.println("Byte tipinden Stirnge çevirme");
        byte s = 4;
        String w = Byte.toString(s);
        System.out.println(w + 5);


    }
}
