// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.



import java.awt.*;
import java.applet.*;

public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);

        for (int k = 0; k < 965; k += 14) {
            g.drawLine(x1 + k, y1, x2, y2 - k);
            y2 += 5;
        }

        for (int k = 0; k < 965; k += 14) {
            g.drawLine(x2 - k, y2, x1, y1 - k);
            y2 = 640;
            y1 += 5;
        }




        }

    }
}
