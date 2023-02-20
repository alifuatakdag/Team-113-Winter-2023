package Sorular_forloops;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        String input = "Java Candir";
        String output = "";

        for (int i = (input.length()-1); i >= 0 ; i--) {
            output += input.charAt(i);
            //System.out.print(output);
        }
        System.out.println(output);
    }
}
