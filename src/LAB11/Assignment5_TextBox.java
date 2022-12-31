/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;

import java.awt.*;
import java.awt.event.*;

public class Assignment5_TextBox {

    public static void main(String args[]) {
        // creating a frame  
        Frame f = new Frame("TextField Example");

        TextField t1, t2;
        t1 = new TextField("Welcome to Java");
        t1.setBounds(50, 100, 200, 30);
        t2 = new TextField("Java Applets");
        t2.setBounds(50, 150, 200, 30);
        // adding the components to frame  
        f.add(t1);
        f.add(t2); 
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}