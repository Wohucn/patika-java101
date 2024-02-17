import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = girdi.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = girdi.nextLine();

        if (userName.equals("deneme") && password.equals("deneme123") ){
            System.out.print("Başarılı giriş");
        }else {
            System.out.println("Kullanıcı adı veya şifreniz hatalı !");
        }
    }
}
