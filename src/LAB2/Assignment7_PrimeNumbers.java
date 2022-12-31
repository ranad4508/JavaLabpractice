/*
 * Write a program to generate all the prime numbers between 1 and n, where n is a value
supplied by the user.
 */
package LAB2;

import java.util.Scanner;

public class Assignment7_PrimeNumbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j, number, digit;
       
        System.out.print("Enter the value of number : ");
        number = sc.nextInt();
        System.out.println("Prime numbers are upto " + number +" are : ");
        for (i = 2; i <= number; i++) {
            digit = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    digit++;
                }
            }

            if (digit == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
