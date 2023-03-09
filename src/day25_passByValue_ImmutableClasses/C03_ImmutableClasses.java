package day25_passByValue_ImmutableClasses;

import java.util.Locale;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        String str = "Java candir";
        str = str.toLowerCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

    }
}
