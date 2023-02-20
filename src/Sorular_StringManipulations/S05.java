package Sorular_StringManipulations;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.


        System.out.println("Lütfen isminizi giriniz: ");
        String isim = klavye.nextLine();
        System.out.println("Lütfen soyisminizi giriniz: ");
        String soyisim = klavye.nextLine();

        if (isim.length() > soyisim.length()) {
            isim = isim.toLowerCase();
            isim= isim.toUpperCase().charAt(0)+isim.substring(1);
            soyisim=soyisim.toLowerCase();
            soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1);
            System.out.println(isim+" "+soyisim);
        }
        if (isim.length()<soyisim.length()){
            isim = isim.toLowerCase();
            isim= isim.toUpperCase().charAt(0)+isim.substring(1);
            soyisim=soyisim.toUpperCase();
            System.out.println(isim+" "+soyisim);
        }


    }
}
