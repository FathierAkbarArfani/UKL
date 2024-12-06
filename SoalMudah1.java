import java.util.Scanner;

public class SoalMudah1 {
    public static void main(String[] args) {
        Scanner moral = new Scanner(System.in);
         int jarak;
         double panjang,lebar,tinggi,volume,harga,hargaawal;
        
        System.out.println("Masukan jarak tempuh:  (KM)");
         jarak = moral.nextInt();
        System.out.println("Panjang benda: ");
         panjang = moral.nextDouble();
        System.out.println("Lebar benda: ");
         lebar = moral.nextDouble();
         System.out.println("tinggi benda: ");
        tinggi = moral.nextDouble();
         if (jarak <=10) {
            hargaawal = 4.250;
            volume = panjang*lebar*tinggi;
            if (volume<=100) {
              System.out.println("Biaya pengiriman perkilogram adalah Rp"+hargaawal);
            } else if (volume>100) {
                harga = hargaawal+50.000;
                System.out.println("Biaya pengiriman perkilogram adalah Rp"+harga);
            }
         } else if (jarak > 10 ) {
            hargaawal = 6.000;
            volume = panjang*lebar*tinggi;
            if (volume<=100) {
              System.out.println("Biaya pengiriman perkilogram adalah Rp"+hargaawal);
        
         } else if (volume>100) {
            harga = hargaawal+50.000;
            System.out.println("Biaya pengiriman perkilogram adalah Rp"+harga);


    }
}
}
}