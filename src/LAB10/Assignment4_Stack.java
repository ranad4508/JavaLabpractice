/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB10;

import java.util.Stack;

public class Assignment4_Stack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1); //insert data into stack
        s.push(2);
        s.push(3);
        s.push(7);
        s.push(5);
        s.push(9);
        s.pop(); //delete data from stack
        System.out.println(s.peek());//show last item added in stack
        s.push(7);
        System.out.println(s.search(9));//search the object 9 and print the index
        System.out.println(s);
    }
}
