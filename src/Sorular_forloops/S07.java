package Sorular_forloops;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        System.out.println("Pozitif tamsayi girini : ");
        int sayi = scan.nextInt();

        int rakamlartoplami = 0;
        int birlerbasamagi;
        String sayistr=""+sayi;


        for (int i = 0; i <sayistr.length(); i++) {
            birlerbasamagi = sayi % 10;
            rakamlartoplami += birlerbasamagi;
            sayi=sayi/10;
        }


        System.out.println(rakamlartoplami);


    }
}
