package view;

import javax.swing.*;
import java.awt.*;

public class rank extends JLabel {
    public  static Image bg=new ImageIcon("imges/list.png").getImage();

    public void paint(Graphics g) {
        g.drawImage(bg,200,200,400,400,null);
    }
}
