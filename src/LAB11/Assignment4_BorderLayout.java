/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;

import java.awt.*;    
import javax.swing.*;    
    
public class Assignment4_BorderLayout   
{    
JFrame f;    
Assignment4_BorderLayout()  
{    
    f = new JFrame();    
        
     // creating buttons  
    JButton b1 = new JButton("NORTH");
    JButton b2 = new JButton("SOUTH");  
    JButton b3 = new JButton("EAST");   
    JButton b4 = new JButton("WEST"); 
    JButton b5 = new JButton("CENTER");
        
    f.add(b1, BorderLayout.NORTH);    
    f.add(b2, BorderLayout.SOUTH);   
    f.add(b3, BorderLayout.EAST);     
    f.add(b4, BorderLayout.WEST);     
    f.add(b5, BorderLayout.CENTER);  
        
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new Assignment4_BorderLayout();    
}    
}  