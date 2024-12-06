import java.util.Scanner;

public class SoalSulit3 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);

        int[] array = new int[6];
        for (int i = 1; i < array.length; i++) {
            System.out.println("Masukan nilai ke-" + i);
            array[i] = moral.nextInt();
        }
        int[] sudahDihitung = new int[array.length];
        int sudahDihitungCount = 0;

        for (int i = 1; i < array.length; i++) {
            int elemen = array[i];
            boolean sudahAda = false;

            for (int k = 0; k < sudahDihitungCount; k++) {
                if (sudahDihitung[k] == elemen) {
                    sudahAda = true;
                    break;
                }
            }

            if (!sudahAda) {
                int count = 0;

                for (int j = 0; j < array.length; j++) {
                    if (array[j] == elemen) {
                        count++;
                    }
                }

                sudahDihitung[sudahDihitungCount++] = elemen;

                System.out.println(elemen + " muncul " + count + " kali");
            }
        }
    }
}
