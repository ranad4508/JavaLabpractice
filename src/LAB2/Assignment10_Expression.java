/*
* Write a program to read the values of x and y and print the results of the following
expressions in one line:
a. (x + y) / (x - y)
b. (x + y) (x - y)
 */
package LAB2;

import java.util.Scanner;
public class Assignment10_Expression {
    public static void main(String args[]){
        int resultA, resultB;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thevalue of x : ");
        int x = sc.nextInt();
        System.out.print("Enter thevalue of y : ");
        int y = sc.nextInt();
        resultA = (x+y)/(x-y);
        resultB = (x+y)*(x-y);
        System.out.println("Your result of expression (x+y)/(x-y) is "+resultA+" and expression (x+y)*(x-y)is "+resultB);
    }
}
