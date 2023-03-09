package Sample_Questions;

import java.util.Random;

public class TcNoGeneratorVeKontrol {
    public static void main(String[] args) {

        //   TC kimlik numarasının
        // 1 - son rakamı çift olmak zorundadır.
        // 2 - 0 rakamı ile başlayamaz.
        // 3 - ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
        // 4 - 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6
        // ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;
        // 5 - 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.


        Random rastgele = new Random();


        int[] tcNo = new int[11];

        int birinciDurum = 0;
        int ikinciDurum = 0;
        int ucuncuDurum = 0;
        int dorduncuDurum = 0;
        int besinciDurum = 0;

        do {
            do {
                do {
                    do {
                        do {
                            for (int i = 0; i < tcNo.length; i++) {
                                int rastgeleSayi = rastgele.nextInt(10);
                                tcNo[i] = rastgeleSayi;
                            }
                            birinciDurum = tcNo[0]; //1 - son rakamı çift olmak zorundadır.
                            ikinciDurum = tcNo[10]%2; // 2 - 0 rakamı ile başlayamaz.
                            // 3 - ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
                            for (int i = 0; i < tcNo.length - 1; i++) {
                                ucuncuDurum += tcNo[i];
                            }
                            // 4 - 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6
                            // ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;
                            int tekRakamToplami = 0;
                            int ciftRakamToplami = 0;
                            for (int i = 1; i < 8; i += 2) { // 2, 4, 6 ve 8. rakamın toplamı
                                ciftRakamToplami += tcNo[i];
                            }
                            for (int i = 0; i <= 9; i += 2) {//1, 3, 5, 7 ve 9. rakamın toplam
                                tekRakamToplami += tcNo[i];
                            }
                            dorduncuDurum = ((tekRakamToplami * 7) + (ciftRakamToplami * 9)) % 10;
                            // 5 - 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
                            besinciDurum = (tekRakamToplami * 8) % 10;
                        } while (birinciDurum == 0);
                    } while (ikinciDurum != 0);
                } while (ucuncuDurum % 10 != tcNo[10]);
            } while (dorduncuDurum != tcNo[9]);
        } while (besinciDurum != tcNo[10]);

       tcNoKontrolVeYazdir(tcNo);

    }

    // TC Kimlik No Kontrolu Yapip yazdiran Method
    public static void tcNoKontrolVeYazdir(int[] tcKimlikNo){

        // Kontrolleri yapıyoruz.
        int kontrolSayaci = 0;

        // 1. Durum: son rakamı çift olmak zorundadır.
        //int birinciDurum = tcKimlikNo[tcKimlikNo.length-1] % 2;
        if (tcKimlikNo[tcKimlikNo.length - 1] % 2 != 0) {
            kontrolSayaci++;
        }

        // 2. Durum: 0 rakamı ile başlayamaz.
        if (tcKimlikNo[0] == 0) {
            kontrolSayaci++;
        }

        // 3. Durum: ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
        int ucuncuDurum = 0;
        for (int i = 0; i < 10; i++) {
            ucuncuDurum += tcKimlikNo[i];
        }
        ucuncuDurum %= 10;
        if (ucuncuDurum != tcKimlikNo[10]) {
            kontrolSayaci++;
        }

        // 4. Durum: 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6
        // ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;

        int tekRakamToplami = 0;
        int ciftRakamToplami = 0;
        for (int i = 1; i < 8; i += 2) { // 2, 4, 6 ve 8. rakamın toplamı
            ciftRakamToplami += tcKimlikNo[i];
        }
        for (int i = 0; i <= 9; i += 2) {//1, 3, 5, 7 ve 9. rakamın toplam
            tekRakamToplami += tcKimlikNo[i];
        }
        int dorduncuDurum = ((tekRakamToplami * 7) + (ciftRakamToplami * 9)) % 10;
        if (dorduncuDurum != tcKimlikNo[9]) {
            kontrolSayaci++;
        }

        // 5. Durum: 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
        int besinciDurum = (tekRakamToplami * 8) % 10;
        if (besinciDurum != tcKimlikNo[10]) {
            kontrolSayaci++;
        }

        // Kontroller yapıldıktan sonra Dogru mu?
        if (kontrolSayaci == 0) {
            dogrudurYazdir(tcKimlikNo);
        } else {
            hataYazdir();
        }
    }

    // Tc kimlik nonun basamka sayisini kontrol edip bize true/false donduren method
    public static boolean tcBasamakSayisiKontrol(long girilenSayi) {
        long sayi;
        int basamakSayisi;
        boolean kontrol = false;
        sayi = girilenSayi;
        basamakSayisi = 0;
        while (sayi > 0) {
            sayi /= 10;
            basamakSayisi++;
        }
        if (basamakSayisi != 11) {
            hataYazdir();
        } else {
            kontrol = true;
        }
        return kontrol;
    }


    // girilen sayıyı TC No olarak Arraye Atama Methodu
    public static long[] tcKimlikNoyuArrayeAta(long girilenSayi) {

        long[] arrayeAtama = new long[11];
        long birlerBasamagi = 0;
        for (int i = 0; i < arrayeAtama.length; i++) {
            birlerBasamagi = girilenSayi % 10;
            arrayeAtama[arrayeAtama.length - 1 - i] = birlerBasamagi;
            girilenSayi /= 10;
        }
        return arrayeAtama;
    }

    // hata yazadır methodu
    public static void hataYazdir() {
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("=== HATALI KIMLIK NO ===");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
    }

    // dorudur yazdir methodu
    public static void dogrudurYazdir(int[] tcKimlikNo) {
        System.out.println();
        System.out.println("********************************");
        System.out.println("===***=== TC KIMLIK NO ===***===");
        System.out.print("===  ");
        for (int i = 0; i < tcKimlikNo.length; i++) {
            System.out.print(tcKimlikNo[i]+" ");
        }
        System.out.println("  ===");
        System.out.println("================================");
        System.out.println();
    }


}





