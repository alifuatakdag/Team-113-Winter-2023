package grupCalismalari;

import java.util.Arrays;

public class Socrative_arrays {
    public static void main(String[] args) {



        short arr[] = new short[4];

        arr[0] = 10;

        arr[1] = 11;

        arr[3] = 13;

        int sum=0;

        for(int i=0; i<arr.length; i++) {

            sum = sum + arr[i];

        }

        System.out.println(sum);




        System.out.println(arr[1] + arr[3]);


    }
}
