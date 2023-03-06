package Sorular_Arrays;

import java.util.Arrays;

public class S01_ElementArtirma {


    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < array.length; i++) {

           array[i] += 2;


        }

        System.out.println(Arrays.toString(array));

        int[] arrayYeni = elementArtirma(array,3);
        System.out.println(Arrays.toString(arrayYeni));



    }


    public static int[] elementArtirma(int[] array, int artis){
        for (int i = 0; i < array.length; i++) {
            array[i] += artis;
        }
        return array;
    }

}
