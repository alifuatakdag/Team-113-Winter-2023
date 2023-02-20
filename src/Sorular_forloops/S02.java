package Sorular_forloops;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            if (i%7==0){
                System.out.print(i +" ");
            }


            }

        }
    }
