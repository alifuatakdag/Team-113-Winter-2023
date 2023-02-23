package Sorular_WhileLoop;

import java.util.Scanner;

public class S06_ekstra {

    public static void main(String[] args) {

        ///*
        //		 Soru 6 ) Kullanicidan pozitif bir tamsayi alin ve bu sayiyi tam bolen sayilari
        //		 ve toplam kac tane olduklarini ekranda yazdirin
        //
        //          bolenleri su sekilde yazdirin
        //		// 1- 1
        //		// 2- 2
        //		// 3- 4
        //		// 4- 5
        //		// 6- 10
        //
        //		 */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int sayi = scan.nextInt();


        tamBolenleri(sayi);
        System.out.println(tamBolenleriToplami(sayi));
    }

    public static void tamBolenleri(int sayi){
        int bolen = 1;
        int bolenAdeti = 0;
        int bolenToplamlari = 0;

        while (bolen <= sayi) {
            if (sayi % bolen == 0) {
                bolenToplamlari += bolen;
                bolenAdeti++;
                System.out.print(bolenAdeti+" - "+bolen+"\n");
            }
            bolen++;
        }
        System.out.println("Toplamları = " + bolenToplamlari + " 'dır.");
    }

    public static int tamBolenleriToplami(int sayi){
        int bolen = 1;
        int bolenAdeti = 0;
        int bolenToplamlari = 0;

        while (bolen <= sayi) {
            if (sayi % bolen == 0) {
                bolenToplamlari += bolen;
                bolenAdeti++;
                //System.out.print(bolenAdeti+" - "+bolen+"\n");
            }
            bolen++;
        }
        //System.out.println("Toplamları = " + bolenToplamlari + " 'dır.");
        return bolenToplamlari;
    }
}
