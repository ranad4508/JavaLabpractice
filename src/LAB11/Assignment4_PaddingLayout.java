/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Assignment4_PaddingLayout extends JFrame {

    Assignment4_PaddingLayout() {

        setTitle("PaddingLayoutDemo");
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2, 2, 2, 2);
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 15;
        c.ipady = 50;
        p.add(new JButton("Java Swing"), c);
        c.gridx = 1;
        c.ipadx = 90;
        c.ipady = 40;
        p.add(new JButton("Padding Layout"), c);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 20;
        c.ipady = 20;
        p.add(new JButton("Java"), c);
        c.ipadx = 10;
        c.gridx = 1;
        p.add(new JButton("Applet"), c);
        WindowListener wndCloser = new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        getContentPane().add(p);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment4_PaddingLayout();
    }
}
