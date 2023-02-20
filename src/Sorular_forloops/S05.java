package Sorular_forloops;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        System.out.println("lütfen 20den kucuk bir sayi giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyel = 1;


        System.out.print(sayi+"!= ");
        for (int i = sayi; i >0 ; i--) {
            faktoriyel = faktoriyel * i;
            System.out.print(i+"*");
        }

        System.out.print(" = "+faktoriyel);
    }
}
