//! Write a Java applet program to take parameters from an HTML file and display the parameter values on a web browser.

import java.applet.Applet;
import java.awt.Graphics;

public class ParameterApplet extends Applet {
    private String param1;
    private String param2;

    @Override
    public void init() {
        param1 = getParameter("param1");
        param2 = getParameter("param2");

        if (param1 == null) {
            param1 = "Default Value 1";
        }
        if (param2 == null) {
            param2 = "Default Value 2";
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Parameter 1: " + param1, 20, 50);
        g.drawString("Parameter 2: " + param2, 20, 70);
    }
}



