/*
 *If the cost price and selling price of an item is input through the keyboard, write a program
to determine whether the seller has made a profit or incurred a loss. Write a program to
determine how much profit or loss is incurred in percentage.
 */
package LAB2;

import java.util.Scanner;

public class Assignment8_ProfitAndLoss {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price: ");
        int sellingPrice = sc.nextInt();
        System.out.print("Enter the cost price: ");
        int costPrice = sc.nextInt();
        int profit = sellingPrice - costPrice;
        int loss = costPrice - sellingPrice;
        int profitPercent = (profit*100)/costPrice;
        int lossPercent = (loss*100)/costPrice;
        if (profit > loss) {
            System.out.println("Your profit is " + profit);
        } else {
            System.out.println("Your loss is " + loss);
        }
        if(profitPercent > lossPercent){
            System.out.println("Your profit percentage is "+profitPercent+ "%");
        }
        else
            System.out.println("Your loss percentage is "+lossPercent+ "%");
    }
}
