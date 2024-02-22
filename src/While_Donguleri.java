import java.util.Scanner;

public class While_Donguleri {
    public static void main(String[] args) {
        int sifre;
        boolean asd = true;
        Scanner girdi = new Scanner(System.in);

        while (asd) {
            System.out.print("Şifreniz: ");
            sifre = girdi.nextInt();
            if (sifre == 1234) {
                System.out.println("Şifreniz Doğru Başarılı giriş");
                asd = false;
            } else {
                System.out.println("Yanlış şifre");
            }
        }

        int left = 100, right = 200;
        while (++left < --right);
        System.out.println("100 ile 200'ün ortası: " + left);



    }
}
