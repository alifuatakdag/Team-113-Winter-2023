package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {

    public static void main(String[] args) {

        // verilen bir array de istenen elemanın olup olmaddigini nulun.


        int[] arr={4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 1));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 1));


    }
}
