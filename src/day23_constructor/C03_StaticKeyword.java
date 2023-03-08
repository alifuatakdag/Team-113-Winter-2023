package day23_constructor;

public class C03_StaticKeyword {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastanetelefonu= "31121332";
    static String bashekimismi= "Kemal Aydin";

    String persIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1 = new C03_StaticKeyword();

        System.out.println(personel1.persIsmi);


    }

}
