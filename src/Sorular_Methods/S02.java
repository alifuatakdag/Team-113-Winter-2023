package Sorular_Methods;

import java.util.Scanner;

public class S02 {

    //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //isim bosluk soyisim seklinde bize donduren bir method olusturun
    //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz


    public static String adSoyad(String isim, String soyIsim){

        isim = isim.toLowerCase();
        soyIsim = soyIsim.toLowerCase();
        isim = isim.toUpperCase().charAt(0) + isim.substring(1);
        soyIsim = soyIsim.toUpperCase().charAt(0)+ soyIsim.substring(1);
        //String isimSoyisim = isim + " " + soyIsim;

        return isim + " " + soyIsim;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Isim giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Soyisim giriniz: ");
        String soyIsim = scan.nextLine();

        System.out.println(adSoyad(isim,soyIsim));


    }

    /*
    public static void main(String[] args) {


        String isim = "aLF";
        String soyisim = "aKDAG";
        isim = isim.toLowerCase();
        soyisim = soyisim.toLowerCase();
        isim = isim.toUpperCase().charAt(0) + isim.substring(1);
        soyisim = soyisim.toUpperCase().charAt(0)+ soyisim.substring(1);
        String adSoyad = isim + " " + soyisim;

        System.out.println(adSoyad);

    }

     */



}
