/*
 Write a Applet program that automatically display the text with Font Style, Font type Using
 getParameter Method.
 */
package LAB11;

import java.awt.*;
import javax.swing.*;

public class Assignment2_Font extends JFrame {

    private JLabel text;
    private Font f;

    public Assignment2_Font() {
        text = new JLabel("This is java Applet");
        add(text);
        f = new Font("Arial", Font.BOLD, 30);
        text.setFont(f);

        setSize(400, 400);
        setVisible(true);
    }

    public void getParameter(Graphics g) {
        g.setFont(f);
    }

    public static void main(String[] args) {
        Assignment2_Font app = new Assignment2_Font();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
