package grupCalismalari;

import java.util.Scanner;

public class S01_AFA_Cozum {
    public static void main(String[] args) {
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

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Kilonuzu Giriniz (kg): ");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen Boyunuzu Giriniz (cm): ");
        double boy = scan.nextDouble();

        double kitleIndeksi = (kilo) / ((boy / 100) * (boy / 100));

        if (kitleIndeksi < 18.5) {
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy +
                    "\nBMI : " + kitleIndeksi +
                    "\nZayif");
        } else if (kitleIndeksi >= 18.5 && kitleIndeksi <= 25) {
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy +
                    "\nBMI : " + kitleIndeksi +
                    "\nIdeal Kilo");
        } else if (kitleIndeksi > 25 && kitleIndeksi < 30) {
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy +
                    "\nBMI : " + kitleIndeksi +
                    "\nSisman");
        } else {
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy +
                    "\nBMI : " + kitleIndeksi +
                    "\nObez");

        }
        System.out.println();
        System.out.println(BoyKiloIndexMethodu.kilomNasil(80, 180));
    }
}
