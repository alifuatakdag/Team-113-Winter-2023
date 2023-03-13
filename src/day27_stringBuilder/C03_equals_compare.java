package day27_stringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

       // System.out.println(sb1 == str);

        System.out.println(sb1.equals(str));


    }
}
