package Sorular_forloops;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        System.out.println("lütfen baslangic sayisini giriniz: ");
        int bas= scan.nextInt();
        System.out.println("Lütfen bitis saiyisini giriniz: ");
        int bit= scan.nextInt();
        int toplam = 0;
        if (bit<bas){
            System.out.println("Baslangic bitisten buyuk olamaz.");
        }else{
            for (int i = bas; i <= bit ; i++) {
                toplam += i;
            }
            System.out.println(toplam);

        }

    }
}
