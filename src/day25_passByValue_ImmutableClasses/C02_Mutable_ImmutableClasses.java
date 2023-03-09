package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses {
    public static void main(String[] args) {
        String str= "Java gun gectikce daha da keyifli oluyor";
        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        System.out.println(str);

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar);



    }
}
