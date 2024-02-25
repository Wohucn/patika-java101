public class Contine_Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i < 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");

        int a = 1;
        while (a <= 10) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);


        }
    }
}
