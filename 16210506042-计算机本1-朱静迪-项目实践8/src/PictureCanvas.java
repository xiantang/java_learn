

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/3/26.
 */
public class PictureCanvas extends JPanel {
    public  static  int pictureID=1;
    private Cell[] cell;
    private Rectangle nullCall;

    public PictureCanvas(){
        this.setLayout(null);
        cell=new Cell[12];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3 ; j++) {
//                System.out.println("src/picture/i_"+(i*3+j+1)+".gif");;
                ImageIcon icon = new ImageIcon("src/picture/1_"+(i*3+j+1)+".gif");
                cell[i*3+j]=new Cell(icon);
                cell[i*3+j].setLocation(j*150+20,i*150+20);
                this.add(cell[i*3+j]);
            }
        }
        this.remove(cell[11]);
        nullCall=new Rectangle(500,470,150,150);
    }

}
