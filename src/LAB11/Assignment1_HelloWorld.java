/*
Write a Applet program to display the “Hello World “in the browser.
 */
package LAB11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment1_HelloWorld extends JFrame {

    private static Dialog d;

    public Assignment1_HelloWorld() {
        Frame f = new Frame();
        d = new Dialog(f, "Hello World", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Assignment1_HelloWorld.d.setVisible(false);
            }
        });
        d.add(new Label("Hello World"));
        d.add(b);
        d.setSize(300, 100);
        d.setVisible(true);
    } // end constructor TextFieldTest

    public static void main(String args[]) {
        Assignment1_HelloWorld application = new Assignment1_HelloWorld();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
