package Sorular_StringManipulations;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin.

        System.out.println("Bir kelime giriniz: ");
        String kelime = scan.nextLine();





        if (kelime.length() % 2 == 0) { //eğer kelime uzunluk karakter sayısı çift ise
            System.out.print(kelime.substring(0, kelime.length() / 2)); //ikiye bölüp ilk bölümü yazdır
            System.out.print(":)");                                     // ortaya :) işareti koy yazdır
            System.out.print(kelime.substring(kelime.length() / 2 , kelime.length())); //ikiye bölüp son kısmı yazdır
        }

        if (kelime.length() % 2 != 0) { //eğer kelime uzunluk karakter sayısı çift değilse
            System.out.println(kelime.replace(kelime.substring(kelime.length() / 2, (kelime.length() / 2) + 1), ":("));
            //kelimenin ortaharfini :( ile değiştirip yazdırır.
        }
    }
}
