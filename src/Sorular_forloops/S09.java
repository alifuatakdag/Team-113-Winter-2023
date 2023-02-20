package Sorular_forloops;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        System.out.println("Lütfen bir yazı giriniz: ");
        String yazi = scan.nextLine();


        for (int i = yazi.length()-1; i >=0 ; i--) {
            System.out.print(yazi.charAt(i));
        }



    }
}
