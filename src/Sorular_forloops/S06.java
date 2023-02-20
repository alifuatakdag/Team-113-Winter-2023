package Sorular_forloops;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        System.out.println("lütfen 20den kucuk bir sayi giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyel = 1;
        System.out.print(sayi+"!= ");

        for (int i = sayi; i >0 ; i--) {
            faktoriyel = faktoriyel * i;
            if (i != 1) {
                System.out.print(i+" * ");
            }else {
                System.out.print(i);
            }
        }
        System.out.print(" = "+faktoriyel);


    }
}
