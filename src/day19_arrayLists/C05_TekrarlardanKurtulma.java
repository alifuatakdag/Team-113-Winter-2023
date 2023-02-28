package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // verilen bir arrayden tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir
        // hale donusturun

        int [] arr= {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        List<Integer> benzersizElementlerList = new ArrayList<>();



        for (int i = 0; i < arr.length; i++) {
            if (benzersizElementlerList.contains(arr[i])) {
                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList);
        System.out.println(Arrays.toString(arr));

    }
}
