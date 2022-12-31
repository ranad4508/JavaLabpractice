//a program to check whether a number is even or odd using a ternary operator.
package LAB2;

import java.util.Scanner;//import scanner class from java.util package for obtaining input

public class Assignment1_OddEven {

    public static void main(String args[]) {
        int firstNumber;//instance variable declaration
        Scanner sc = new Scanner(System.in);//declare the object
        System.out.print("Enter number to be checked: ");//taking input from user
        firstNumber = sc.nextInt();//numerical data(instance variable) input
        String oddEven = (firstNumber % 2 == 0) ? "even" : "odd";//using ternary operator to check the number is odd or even

        System.out.println("Number "+firstNumber + " is " + oddEven);//display the whether the number is odd or even
    }
}
