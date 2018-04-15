import javax.swing.*;
import java.awt.*;

public class Grades {
    Player player;

    public Image[] images=new Image[]{
            Toolkit.getDefaultToolkit().getImage("src/imges/number/0.png"),
            Toolkit.getDefaultToolkit().getImage("src/imges/number/1.png"),
            Toolkit.getDefaultToolkit().getImage("src/imges/number/2.png"),
            Toolkit.getDefaultToolkit().getImage("src/imges/number/3.png"),
            Toolkit.getDefaultToolkit().getImage("src/imges/number/4.png"),
            Toolkit.getDefaultToolkit().getImage("src/imges/number/5.png")

    };
    public Grades(Player player) {
        this.player = player;

    }
    public  int getGrades(){
        return  player.score;
    }

    public  void  drawSelf(Graphics g){
        if (getGrades()==0){
            g.drawImage(images[0],530,25,25,25,null);
        }else if (getGrades()==1000){
            g.drawImage(images[1],530,25,25,25,null);
            g.drawImage(images[0],550,25,25,25,null);
            g.drawImage(images[0],570,25,25,25,null);
            g.drawImage(images[0],590,25,25,25,null);
        }else if (getGrades()==2000){
            g.drawImage(images[2],530,25,25,25,null);
            g.drawImage(images[0],550,25,25,25,null);
            g.drawImage(images[0],570,25,25,25,null);
            g.drawImage(images[0],590,25,25,25,null);
        }else if (getGrades()==3000){
            g.drawImage(images[3],530,25,25,25,null);
            g.drawImage(images[0],550,25,25,25,null);
            g.drawImage(images[0],570,25,25,25,null);
            g.drawImage(images[0],590,25,25,25,null);
        }
    }

}
