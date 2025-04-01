package Message;
//! wap to enter a java applet program to print a message



import java.applet.Applet;
import java.awt.Graphics;


public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Welcome to Java Applet!", 50, 100);
    }
}
