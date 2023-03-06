package Sorular_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class S05_ArrayOlusturmaMethodu {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Array boyutunu girin: ");
        int arrayBoyutu = scan.nextInt();
        int[] array = new int[arrayBoyutu];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println("arrayin " + (i + 1) + ". elemanını giriniz: ");
            int eleman = scan.nextInt();
            array[i] = eleman;
        }
        System.out.println(Arrays.toString(array));

 */

        int[] arr = arrayOlusturma(5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayOlusturma(int arrayBoyutu){
        Scanner scan = new Scanner(System.in);

        int[] array = new int[arrayBoyutu];
        //System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println("arrayin " + (i + 1) + ". elemanını giriniz: ");
            int eleman = scan.nextInt();
            array[i] = eleman;
        }



        return array;
    }
}
