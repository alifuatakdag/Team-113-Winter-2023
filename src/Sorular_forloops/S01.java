package Sorular_forloops;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in );

        //Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        //yazdirin.




        for(int i=1; i<=5; i++) {

            for(int j=(5-i); j>1; j--) {

                System.out.print(i+j);

            }

            System.out.println();

        }
       /*
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i+" ");
        }

        */


    }
}
