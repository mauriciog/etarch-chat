import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.*;
 
public class Smiles extends JEditorPane {
    static ImageIcon SMILE_IMG=createImage();
 
    static ImageIcon createImage() {
        BufferedImage res=new BufferedImage(17, 17, BufferedImage.TYPE_INT_ARGB);
        Graphics g=res.getGraphics();
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.yellow);
        g.fillOval(0,0,16,16);
 
        g.setColor(Color.black);
        g.drawOval(0,0,16,16);
 
        g.drawLine(4,5, 6,5);
        g.drawLine(4,6, 6,6);
 
        g.drawLine(11,5, 9,5);
        g.drawLine(11,6, 9,6);
 
        g.drawLine(4,10, 8,12);
        g.drawLine(8,12, 12,10);
        g.dispose();
 
        return new ImageIcon(res);
    }
}