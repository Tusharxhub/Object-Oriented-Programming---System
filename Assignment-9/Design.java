//! Write a program in Java to design a form that includes one label, one text field, and one button using Swing.



import javax.swing.*;

public class Design {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(new JLabel("Enter text"));
        frame.add(new JTextField(20));
        frame.add(new JButton("OK"));
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
