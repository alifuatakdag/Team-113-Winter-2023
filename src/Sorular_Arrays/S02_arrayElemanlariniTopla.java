package Sorular_Arrays;

public class S02_arrayElemanlariniTopla {
    public static void main(String[] args) {

        int[] array = {8,9,0};

        System.out.println(arrayElemanlariToplami(array));
    }

    public static int arrayElemanlariToplami(int[] array){

        int elemanlarToplami = 0;
        for (int i = 0; i < array.length; i++) {
            elemanlarToplami += array[i];

        }
        return elemanlarToplami;
    }
}
