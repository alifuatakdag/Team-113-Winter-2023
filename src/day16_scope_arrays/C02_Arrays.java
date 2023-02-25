package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String[] isimler = {"Nurefsan", "Berken","Mustafa"};

        int[]sayilar = {3,4,5,6,7,8,9,8,7,6,5,4};

        char karakterler[]={'e','4',','};

        String[] arr= new String[5];

        System.out.println(isimler);

        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.toString(arr));

        int[] a= new int[7];

        System.out.println(Arrays.toString(a));


        a[0] = 4;

        a[2] = 6;

        a[4] = 8;

        a[6] = 8;
        System.out.println(Arrays.toString(a));


    }


}
