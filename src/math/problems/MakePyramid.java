package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        for (int a = 6; a > 0; a--) {
            int b;
            for (b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = b; c < 7; c++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        }
  }
