package Sorular_forloops;

public class S17 {
    public static void main(String[] args) {

        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa

        String input= "Java candir, Selenium heyecandir";
        //giris yazıldı


















        for (int i = 0; i <input.length() ; i++) {

            System.out.print  ( i%2==0   // index cift mi ?
                    ? input.substring(i,i+1).toUpperCase() // index cift ise
                    : input.substring(i,i+1).toLowerCase() // index cift degilse
            );
        }
    }
}
