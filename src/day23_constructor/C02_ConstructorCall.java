package day23_constructor;

public class C02_ConstructorCall {

    int sayi;
    String str;


    public C02_ConstructorCall() {
    }

    public C02_ConstructorCall(int sayi) {
        this.sayi = sayi;
    }

    public C02_ConstructorCall(String str) {
        this.str = str;
    }

    public C02_ConstructorCall(int sayi, String str) {

        this.sayi = sayi;
        this.str = str;
    }
}
