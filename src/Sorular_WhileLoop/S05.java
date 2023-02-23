package Sorular_WhileLoop;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("lütfen üssünü giriniz:");
        int us2 = scan.nextInt();

        System.out.println(usHesapla(sayi1, us2));   }



    public static int usHesapla(int sayi, int us){


        int us1 = 1;
        int usluSonuc = 1;

        while (us1 <= us) {
            usluSonuc *= sayi;
            us1++;
        }
        //System.out.println(usluSonuc);

        return usluSonuc;
    }
}
