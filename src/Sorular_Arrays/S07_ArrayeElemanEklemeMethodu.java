package Sorular_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class S07_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.


        Scanner scan = new Scanner(System.in);

        int[] array = {1,2,3,5,6,7,10};

        System.out.println(Arrays.toString(arrayeElemanEklemeMethodu(array, 10)));


    }

    public static int[] arrayeElemanEklemeMethodu(int[] array, int eklenecekEleman){

        int[] yeniArray = new int[array.length+1];
        for (int i = 0; i <array.length ; i++) {
            yeniArray[i]=array[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekEleman;

        return yeniArray;
    }


}
