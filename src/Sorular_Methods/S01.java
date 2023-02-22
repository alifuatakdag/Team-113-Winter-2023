package Sorular_Methods;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //mesaji verin
        //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        //yazdirin.

        basBitIndexYazdir("ahmetfdh",2, 6);
    }

    public static void basBitIndexYazdir(String input, int bas, int bit) {
        if (bas>bit){
            System.out.println("baslangic bitisten buyuk olamaz");
        }else if (bit>=input.length()){
            System.out.println("Buyuk index girdiniz!!");
        }else {
            System.out.println(input.substring(bas,bit));
        }
    }

}
