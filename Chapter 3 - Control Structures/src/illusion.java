import java.awt.*;
import java.applet.*;
public class illusion extends Applet {
    public void paint(Graphics page) {
        int width = 980, height = 630;
        page.drawRect(10,10,width,height);
        int xstart = 990, ystart = 640, xend = 10, yend = 640;
        
        //Bottom left
        for(int i = 1; i <= 50; i++) {
            page.drawLine(xstart, ystart, xend, yend);
            xstart -= width/50;
            yend -= height/50;
        }
         xstart = 10;
         ystart = 640;
         xend = 990;
         yend = 640;

        //Bottom-right
        for(int i = 1; i <= 50; i++) {
            page.drawLine(xstart, ystart, xend, yend);
            xstart += width/50;
            yend -= height/50;
        }
    }
}

