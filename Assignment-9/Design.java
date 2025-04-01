//! Write a program in Java to design a form that includes one label, one text field, and one button using Swing.



import javax.swing.*;

public class Design
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Swing Example");
        JLabel label = new JLabel("Enter text");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("OK");

        frame.setLayout(new java.awt.FlowLayout()); 
        frame.add(textField);
        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
