package Sorular_forloops;

public class S12_NestedForLoop {
    public static void main(String[] args) {
        //* * * * * * * *
        //* * * * * *
        //* * * *
        //* *

        int satir = 4;
        int sutun = 8;


        for (int i = satir; i >= 1; i--) {
            for (int j = i*2; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
