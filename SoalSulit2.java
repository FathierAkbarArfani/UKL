import java.util.Scanner;

public class SoalSulit2 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);
         int[] angka = new int[6];
         
        for (int i = 1; i < angka.length; i++) {
            System.out.println("Masukan nilai dalam array ke-"+i);
            angka[i] = moral.nextInt();
        }
     boolean adaDuplikat = cekDuplikat(angka);
    if (!adaDuplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }

    public static boolean cekDuplikat(int[] angka) {
        
        for (int i = 0; i < angka.length; i++) {
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] == angka[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + angka[i]);
                    return true; 
                }
            }
        }
        return false; 
    }
}
