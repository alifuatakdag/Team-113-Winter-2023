package Sorular_forloops;

public class S14_NestedForLoop {
    public static void main(String[] args) {

        // *                 * 16
        // * *             * * 12
        // * * *         * * * 8
        // * * * *     * * * * 4
        // * * * * * * * * * *
        int satir = 5;

        /*
        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                }
            for (int k = 16; k >=1 ; k-=2) {
                System.out.print("a ");
            }
            System.out.println();
        }

         */



        for (int i = 5; i >= 1; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print("a");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            //System.out.println("* ");

            System.out.println("b");



        }




    }
}
