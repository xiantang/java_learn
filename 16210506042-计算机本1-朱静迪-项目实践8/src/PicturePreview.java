import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by Administrator on 2018/3/26.
 */
public class PicturePreview extends JPanel{

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        String filename="src/picture/1.jpg";
        ImageIcon icon =new ImageIcon(filename);
        Image image =icon.getImage();
        g.drawImage(image,0,0,480,600,null);
    }
}
