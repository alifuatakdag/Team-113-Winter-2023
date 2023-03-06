package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C03_arrayElementleriniBenzersizYapma {
    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan
        // sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");

        list.add("B");

        list.add("C");

        list.add("D");

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");

        }
    }
}
