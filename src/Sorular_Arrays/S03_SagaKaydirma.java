package Sorular_Arrays;

import java.util.Arrays;

public class S03_SagaKaydirma {
    public static void main(String[] args) {
        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int[] array = {4,5,6,7};

        int temp = array[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            array[array.length-1-i]=array[array.length-2-i];
        }
        array[0]=temp;

        System.out.println(Arrays.toString(array));
    }



}
