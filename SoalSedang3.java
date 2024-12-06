import java.util.Random;
import java.util.Scanner;

public class SoalSedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;

        while (lanjut) {

            int bil1 = random.nextInt(10)+1; 
            int bil2 = random.nextInt(10)+1; 

           
            char[] operators = { '*', '/', '%' };
            char operator = operators[random.nextInt(3)];

           
            int jawabanBenar = 0;
            switch (operator) {
                case '*':
                    jawabanBenar = bil1 * bil2;
                    break;
                case '/':
                    jawabanBenar = bil1 / bil2;

                    break;
                case '%':
                    jawabanBenar = bil1 % bil2;
                    break;
            }

            System.out.println(bil1 + " " + operator + " " + bil2 + " = ?");
            System.out.print("Jawaban Anda: ");
            int jawabanUser = scanner.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String respon = scanner.next();
            if (respon.equalsIgnoreCase("tidak")) {
                lanjut = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }

        scanner.close();
    }
}