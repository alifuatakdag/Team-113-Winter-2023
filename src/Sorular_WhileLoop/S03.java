package Sorular_WhileLoop;

public class S03 {
    public static void main(String[] args) {


        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.


        // for ile

        String metin = "abcdjgs";
        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println(tersMetin);


        // While ile

        int uzunluk = metin.length()-1;
        String tersMetin2 = "";
        String metin2 = metin;

        while (uzunluk >= 0) {
            tersMetin2 += metin2.charAt(uzunluk);
            uzunluk--;
        }
        System.out.println(tersMetin2);


    }
}
