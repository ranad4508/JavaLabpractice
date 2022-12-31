/*
 * Write a program to count the number of digits in each integer.
 */
package LAB2;

/**
 *
 * @author Dinesh
 */
public class Assignment5_CountDigits {
    public static void main(String[] args) {
        int count = 0, number = 34523;
        while (number != 0) {
            // num = num/10
            number /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
