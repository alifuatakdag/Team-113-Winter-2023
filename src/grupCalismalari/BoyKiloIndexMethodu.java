package grupCalismalari;

public class BoyKiloIndexMethodu {

    public static String kilomNasil(double kilo, double boy) {

        // Boy Kilo Indeksini hesaplayarak sonucunu bize "zayıf", "ideal kilo", "sisman" ve "obez" döndüren method.

        double kitleIndeksi = (kilo) / ((boy / 100) * (boy / 100));

        String boyKiloIndeksSonucu = "";

        if (kitleIndeksi < 18.5) {
            boyKiloIndeksSonucu = "Zayif.";
        } else if (kitleIndeksi >= 18.5 && kitleIndeksi <= 25) {
            boyKiloIndeksSonucu = "Ideal Kilo";
        } else if (kitleIndeksi > 25 && kitleIndeksi < 30) {
            boyKiloIndeksSonucu = "Sisman";
        } else {
            boyKiloIndeksSonucu = "Obez";
        }
        return boyKiloIndeksSonucu;
    }
}
