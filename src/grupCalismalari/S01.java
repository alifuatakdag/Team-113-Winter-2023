package grupCalismalari;


import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
                   Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
                   program yazın (BMI)
                   IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
                   BMI 18,5'in altındaysa zayıfsınız
                   BMI 18,5 ile 25 arasında ise kilonuz idealdir
                   BMI 25-30 arasındaysa şişmansınız
                   BMI 30'dan büyük veya eşitse, obez
                   Input:
                   Output:
                   Agirlik : 71
                   Boy : 1,72
                   BMI : 23.99945916711736
                   Zayifsiniz.
                */

        System.out.println("lütfen kilonuzu giriniz (kg): ");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz (cm): ");
        double boy = scan.nextDouble();

        double kitleIndeksi = kilo / (boy/100*boy/100);


        System.out.println("Agirlik : "+kilo+
                "\nBoy: "+boy+
                "\nBMI: "+kitleIndeksi);

        if (kitleIndeksi<18.5){
            System.out.println("Zayif");
        } else if (kitleIndeksi<25) {
            System.out.println("Ideal");
        } else if (kitleIndeksi<30) {
            System.out.println("Sisman");
        }else {
            System.out.println("Obez");
        }



    }
}
