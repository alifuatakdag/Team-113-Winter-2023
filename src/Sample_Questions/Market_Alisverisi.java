package Sample_Questions;

import java.util.Scanner;

public class Market_Alisverisi {
    public static void main(String[] args) {
        // Basit bir 5 ürünlü manav alisveris programi yaziniz.
        //
        //  1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        //  2. Adim : Baska bir urun almak isteyip istemedigini sor.
        //             istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
        //             Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        //  3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        //  4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Scanner scan = new Scanner(System.in);

        String[] urunler = {"Elma", "Armut", "Seftali"};
        double[] fiyatlar = {5, 10, 15};
        String devamMi = "E";
        double tutar = 0.0;
        int urunNo;
        double kilo;

        do {
            for (int i = 0; i < urunler.length; i++) {
                System.out.println((i + 1) + ". " + urunler[i] + " - "+ fiyatlar[i]+" TL");
            }
            System.out.println("Lutfen Almak Istediginiz Urunu Seciniz : ");
            urunNo = scan.nextInt();
            System.out.println("Kac Kilo Almak istediginizi giriniz : ");
            kilo = scan.nextDouble();
            tutar = kilo * fiyatlar[urunNo - 1];
            System.out.println("Toplam Tutar : "+ tutar);

            System.out.println("Alisverise Devam Etmek Istiyor Musunuz? (E/H): ");
            devamMi = scan.next();
        } while (devamMi.equalsIgnoreCase("E"));

        tutar += kilo * fiyatlar[urunNo - 1];
        System.out.println("Toplam Tutar : "+ tutar);
    }



}

