package day11_stringManipulations_ForLoop;

import java.util.Scanner;

public class C07_SifreKontrol {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan =new Scanner(System.in);

        System.out.println("Bir Sifre Giriniz: ");
        String sifre = scan.nextLine();
        int flag = 0;


        char ilkharf = sifre.charAt(0);
        if (ilkharf>='a' && ilkharf<='z'){
            flag++;
        }else {
            System.out.println("İlk Harf Kucuk Olmali");
        }


        char sonkarakter = sifre.charAt(sifre.length()-1);
        if (sonkarakter>='0' && sonkarakter<='9'){
            flag++;
        }else{
            System.out.println("son karakter rakam olmali");
        }


        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else{
            flag++;
        }

        if (sifre.length()<10){
            System.out.println("uzunlugu en az 10 karakter olmali");
        }else {
            flag++;
        }

        if (flag==4){
            System.out.println("sifre basariyla kaydedildi");
        }












    }
}
