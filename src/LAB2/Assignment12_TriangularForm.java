/*
 * Write a C program to print the numbers in triangular form

1
1 2
1 2 3
1 2 3 4
 */
package LAB2;

public class Assignment12_TriangularForm {

    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
