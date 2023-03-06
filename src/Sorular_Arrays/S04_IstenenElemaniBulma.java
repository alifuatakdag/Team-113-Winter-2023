package Sorular_Arrays;

public class S04_IstenenElemaniBulma {
    public static void main(String[] args) {

        int[] array = {1,2,3,2,3,4,5,3,2245,5,56,6,6};

        elemanSayisiYazdir(array,6);



    }

    public static void elemanSayisiYazdir(int[] array, int arananSayi) {
        int sayac = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arananSayi) {
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aranan Eleman Yoktur.");
        }else {
            System.out.println("Aranan Eleman "+sayac+" tane vardır.");
        }
    }
}
