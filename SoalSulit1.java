import java.util.Scanner;
 
public class SoalSulit1 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);
        double jumlahsiswa,RataRata,nilai = 0,siswa,temp=0,total;

        System.out.println("Masukan jumlah siswa: ");
        jumlahsiswa = moral.nextDouble();
        siswa = 1;
        
       while (siswa <= jumlahsiswa) {
        System.out.println("Masukan nilai siswa "+siswa+":");
        nilai = moral.nextDouble();
        siswa++;
        temp += nilai;
       }
       total = temp;
       RataRata = temp/jumlahsiswa;
       System.out.println("Nilai rata-rata adalah: "+RataRata);
       System.out.println("Nilai total adalah: "+total);
    }
}