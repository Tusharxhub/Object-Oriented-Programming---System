//! Write a Java applet program to take parameters from an HTML file and display the parameter values on a web browser.

import java.applet.Applet;
import java.awt.Graphics;

public class ParameterApplet extends Applet {
    String message;

    public void init() {
        message = getParameter("message");
        if (message == null) {
            message = "No parameter found!";
        }
    }

    public void paint(Graphics g) {
        g.drawString("Message from HTML: " + message, 20, 50);
    }
}
