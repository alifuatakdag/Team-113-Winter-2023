package day27_stringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {
        // verilen metni tersin ecevirin

        String str = "Java Candir.";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);




    }
}
