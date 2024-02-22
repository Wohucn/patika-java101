import java.util.Scanner;

public class do_while_Donguleri {
    public static void main(String[] args) {
        int pass;
        boolean passsor = true;
        Scanner girdi = new Scanner(System.in);
        do {
            System.out.print("Şifrenizi giriniz: ");
            pass = girdi.nextInt();
            if (pass == 123){
                System.out.println("Doğru");
                passsor = false;
            }else {
                System.out.println("Yanlış");
            }
        }while (passsor);


        int age=20;
        do
        {
            age++;
        }while(age<20);

        System.out.println(age);
    }
}
