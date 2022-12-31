/*
 * Write a program to find GCD (greatest common divisor or HCF) and LCM (least common
 multiple) of two numbers.
 */
package LAB2;

import java.util.Scanner;

public class Assignment11_HCFAndLCM {

    public static void main(String args[]) {
        int firstNumber, secondNumber;
        int gcd, lcm, remainder, numerator, denominator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers : ");
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();
        if (firstNumber > secondNumber) {
            numerator = firstNumber;
            denominator = secondNumber;
        } else {
            numerator = secondNumber;
            denominator = firstNumber;
        }
        remainder = numerator % denominator;
        while (remainder != 0) {
            numerator = denominator;
            denominator = remainder;
            remainder = numerator % denominator;
        }
        gcd = denominator;
        lcm = firstNumber * secondNumber / gcd;
        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " = " + gcd);
        System.out.println("LCM of " + firstNumber + " and " + secondNumber + " = " + lcm);
    }
}
