import java.util.Scanner;
public class SoalSedang2 {
    static double luaspermukaan(double r, double tinggi) {
        double phi = 3.14;
        double Lua4spermukaan = 2*phi*r*(r+tinggi);
        return Lua4spermukaan;
    }
   static double volume(double r, double tinggi) {
    double phi = 3.14;
    double volume = r*r*phi*tinggi;
    return volume;
    
   }    
   public static void main(String[] args) {
    double diameter;
    double tingg1;
    double jarijari;
    

    Scanner moral = new Scanner(System.in);
    System.out.println("Masukan diameter: ");
    diameter = moral.nextDouble();
    System.out.println("Masukan tinggi: ");
    tingg1 = moral.nextDouble();
    jarijari = diameter/2;

    
        System.out.println(luaspermukaan(jarijari, tingg1));
    
        System.out.println(volume(jarijari, tingg1));   
    }

    
    } 

