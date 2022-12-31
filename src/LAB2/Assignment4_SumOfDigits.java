/*
 * Write a program to find the sum of individual digits of a 3-digit number.
 */
package LAB2;


public class Assignment4_SumOfDigits {

    public static void main(String args[]) {
        int firstNumber=342, digit, sum = 0;
        while (firstNumber != 0 ) {
            //finds the last digit of the given number    
            digit = firstNumber % 10;
            //adds last digit to the variable sum  
            sum = sum + digit;
            //removes the last digit from the number  
            firstNumber = firstNumber / 10;
        }
        //prints the result  
        System.out.println("Sum of Digits: " + sum);
    }
}
