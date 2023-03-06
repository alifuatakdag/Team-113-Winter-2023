package Sorular_Arrays;

public class S06_EnUzunElemanYazdir {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] array = {"Melike", "Burkay", "inci", "Eda", "Emre","su","alifuat"};

        enUzunEnKisaYazdir(array);

    }

    public static void enUzunEnKisaYazdir(String[] array) {
        String enUzunKelime = array[0];
        String enKisaKelime = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].length()>enUzunKelime.length()){
                enUzunKelime=array[i];
            }
            if (array[i].length()<enKisaKelime.length()){
                enKisaKelime=array[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime: "+enUzunKelime);
        System.out.println("Arraydeki en kisa kelime: "+enKisaKelime);
    }

}
