package Lab3;

import javax.swing.*;
import java.awt.*;

public class Lab3_2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab3_2");
        jFrame.add(new Component());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(400, 100, 600, 410);
    }

    static class Component extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics = (Graphics2D) g;
            Font labelFont = new Font("Times New Roman", Font.ITALIC, 18);
            Font headerFont = new Font("Times New Roman", Font.BOLD, 24);

            graphics.drawLine(40, 30, 40, 300);
            graphics.drawLine(40, 300, 500, 300);
            graphics.setColor(Color.PINK);
            graphics.fillRect(170, 80, 80, 220);
            graphics.setColor(Color.BLUE);
            graphics.fillRect(70, 100, 80, 200);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(270, 50, 80, 250);
            graphics.setColor(Color.RED);
            graphics.fillRect(370, 60, 80, 240);

            graphics.setFont(labelFont);
            graphics.setColor(Color.BLUE);
            graphics.drawString("58000$", 80, 90);
            graphics.drawString("60000$", 180, 70);
            graphics.drawString("70000$", 280, 40);
            graphics.drawString("65000$", 380, 50);
            graphics.setFont(headerFont);
            graphics.setColor(Color.RED);
            graphics.drawString("Дохід фірми за 4 квартали", 90, 20);
        }
    }
}
