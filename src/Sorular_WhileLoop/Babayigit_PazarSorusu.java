package Sorular_WhileLoop;

import java.util.Scanner;

public class Babayigit_PazarSorusu {
    public static void main(String[] args) {
                /*
                Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
                Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
                bilince de tebrik edip durduran bir kod yazalim
                */

        Scanner scan = new Scanner(System.in);

        int sistemdekiSayi = 57;


        int girilenSayi;
        int denemeSayisi = 1;

        do {
            System.out.println("Sistemdeki sayıyı bulmak için Lütfen bir Sayi Giriniz: ");
            girilenSayi = scan.nextInt();
            if (girilenSayi < sistemdekiSayi) {
                System.out.println("Sayiyi YUKSELT Tekrar Dene\n");
            } else if (girilenSayi > sistemdekiSayi) {
                System.out.println("Sayiyi DUSUR Tekrar Dene\n");
            } else {
                System.out.println("TEBRIKLER!!!\n\n" + denemeSayisi + ". Denemede Basarili Oldunuz.");
            }
            denemeSayisi++;
        } while (girilenSayi != sistemdekiSayi);
    }
}
