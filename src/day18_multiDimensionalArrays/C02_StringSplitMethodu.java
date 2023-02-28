package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {



        String str= "JAva candir can,";

        // str kaç kelimedir?

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        System.out.println(kelimeler.length);



        // en uzun keime kaç harflidir?

        //karakterler

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));



    }
}
