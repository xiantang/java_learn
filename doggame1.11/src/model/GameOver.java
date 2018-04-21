package model;

import db.Sqlserver;

import javax.swing.*;
import java.awt.*;

//+++++++++++++++++++++++++++++++++++++++++++++++++
//       这个类在  paintThrad中实现的
//++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class GameOver {
//    游戏借宿的那张图的基础位置  把图片放在jframe外面
    public static  int gameover_x=1003;
    public static  int gameover_y=40;
    public  Grades grades;
    public static Image image_gameover;

//    游戏结束的从右往左的那张图
    public GameOver(Grades grades) {
        this.grades=grades;
        image_gameover= new ImageIcon("imges/lose.png").getImage();
    }


    public void drawself_gameover (Graphics g) {

        g.drawImage(image_gameover,gameover_x,gameover_y,406,364,null);
        if (gameover_x==299){
            Sqlserver sqlserver=new Sqlserver();
            grades.drawEndSelf(g); //画出游戏结束的分数
        }

    }
}
