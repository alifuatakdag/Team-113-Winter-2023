package Sorular_forloops;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.
        System.out.println("Lütfen bRİ sayı giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }

        }
        if (sayac== 0) {
            System.out.println("asal sayıdır");
        } else{
            System.out.println("Asal değildir");
        }


    }
}
