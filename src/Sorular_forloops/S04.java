package Sorular_forloops;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        System.out.println("lütfen baslangic sayisini giriniz: ");
        int bas= scan.nextInt();
        System.out.println("Lütfen bitis saiyisini giriniz: ");
        int bit= scan.nextInt();
        int toplam = 0;
        if (bit<bas){
            for (int i = bit; i <= bas ; i++) {
                toplam = toplam + i;
            }
            System.out.println(toplam);
        }else{
            for (int i = bas; i <= bit ; i++) {
                toplam = toplam + i;
            }
            System.out.println(toplam);
    }
}}

