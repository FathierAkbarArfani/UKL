import java.util.Scanner;

public class SoalMudah3 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);
        for (int i = 50; i > 0; i--) {
            if (i == 1) {
                System.out.println(i + ". saya senang");
            } else if (i % 3 == 0 && i != 1) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0 && i != 1) {
                System.out.println(i + ". saya anak moklet");
            } else if (i % 1 == 0 && i != 1) {
                System.out.println(i + ". saya anak wikusama");
            }                
            }
        }
    }

