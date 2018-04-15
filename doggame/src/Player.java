import javax.swing.*;
import java.awt.*;

public class Player {
    public  static int x;
    public  static int y;
    public  static int width=71;
    public  static int height=53;
    public    int score=0;
//    public  int spring=10;
    //    public  static Image bg=new ImageIcon("src/imges/地图.png").getImage();
    public  Image image =new ImageIcon("src/imges/dogx.png").getImage();

    public  boolean Left=false;
    public  boolean Right=false;
    public  int Up=-1; //人物  -1 玩家在平地 可以上去  0表示人物在空中无法按下第二下  1表示人物上天了

    //一定要写对路径  而且要用image icon

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public  void  drawSelf(Graphics g){
        g.drawImage(image,x,y,width,height,null);
    }

    public Rectangle getRectangle(){
        Rectangle playRect=new Rectangle(x,y,width-10,height-10);
        return playRect;
    }
}
