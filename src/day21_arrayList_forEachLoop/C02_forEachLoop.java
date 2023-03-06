package day21_arrayList_forEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8};

        // arrayin tüm elemenentlerinin toplamını yazdirin

        // arrayin elementlerinden 3 ile bölünebilenleri ni yazdırın

        // arrayin elementleri içinde kac tane tek sayi oldugunu bulun


        int toplam = 0;

        for (int each : arr
        ) {
            toplam += each;
        }

        System.out.println("Elementler Toplami: "+ toplam);
    }
}
