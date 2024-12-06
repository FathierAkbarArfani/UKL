import java.util.Scanner;

public class SoalMudah2 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);
        int bilangan;
        System.out.println("Masukan bilangan anda: ");
        bilangan = moral.nextInt();
        if (bilangan % 2 ==0) {
            System.out.println("Bilangan "+bilangan+" adalah genap");
        } else if (bilangan % 2 == 1) {
            System.out.println("Bilangan "+bilangan+" adalah ganjil");
        } else if (bilangan < 0) {
            System.out.println("bilangan harus positif!");
        }
    }
}
