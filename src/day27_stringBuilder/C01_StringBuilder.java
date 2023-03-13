package day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        sb1.append("Mustafa");

        System.out.println(sb1);


        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        sb1.append(" Yilmazturk");

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        sb1.append(" javayı cok sever sabah aksam java calisir");

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

    }
}
