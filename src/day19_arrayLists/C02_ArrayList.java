package day19_arrayLists;

import day17_arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        // ArrayList, uzunlugu esnek bir listedir.
        // Array alt yapisini kullanir.
        // ancak ekeleme ve silme gibi islemlerde daha avantajlidir

        // ArrayList in tek dezavantaji var.
        // Elemenetleri tek tek eklememiz gerekmesi



        int[] arr = {3, 4};
        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr, 5);
        System.out.println(Arrays.toString(arr));


        //List<String> harfler = new ArrayList<>();

        List<String> harfler = new ArrayList<>();

        System.out.println(harfler);

        harfler.add("a");







    }
}
