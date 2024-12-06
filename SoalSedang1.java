import java.util.Scanner;

public class SoalSedang1 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);
        double bilangan;
        System.out.println("Masukan bilangan: ");
        bilangan = moral.nextDouble();
      
        if (bilangan < 1) {
            System.out.println("Bilangan error!");
        } else {
            long faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
           faktorial *=i;
           System.out.println(faktorial);
        }
    }
    }
}
