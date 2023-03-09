package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);

        elementlerArtir(sayilar);
        System.out.println(sayilar);
        yeniListeAta(sayilar);
        System.out.println(sayilar);
    }

    public static void elementlerArtir(List<Integer> sayilar) {
        // tum elementleri 2 katına artir
        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i) * 2);

        }
        System.out.println("Elementleri Artir Methodunda : " + sayilar);


    }

    public static void yeniListeAta(List<Integer> sayilar) {
        // sayilar listeisine yeni bir liste atayin
        // sonra 1,2,3 elementleri eklyein.

        sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        System.out.println("SAyilar: " + sayilar);
    }


}
