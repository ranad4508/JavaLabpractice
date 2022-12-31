/*
 * Write a program to check whether a given 3-digit number is an Armstrong number or not.
 */
package LAB2;

import java.util.Scanner;
public class Assignment9_ArmstrongNumber {
    public static void main(String args[]){
        int remainder, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit number to  check :");
        int number = sc.nextInt();
        int temp = number;
        while (number != 0)
        {
            remainder = number % 10;
            sum += Math.pow(remainder, 3);
            number /= 10;
        }

        if(sum == temp)
            System.out.println(sum + " is an Armstrong number.");
        else
            System.out.println(sum + " is not an Armstrong number.");
    }
}
