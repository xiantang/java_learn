package model;

import java.awt.*;

public class Grades {


    public Image[] images=new Image[]{
            Toolkit.getDefaultToolkit().getImage("imges/number/0.png"),
            Toolkit.getDefaultToolkit().getImage("imges/number/1.png"),
            Toolkit.getDefaultToolkit().getImage("imges/number/2.png"),
            Toolkit.getDefaultToolkit().getImage("imges/number/3.png"),
            Toolkit.getDefaultToolkit().getImage("imges/number/4.png"),
            Toolkit.getDefaultToolkit().getImage("imges/number/5.png")

    };

    public  int getGrades(){
        return  Player.score;
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
    public  void  drawEndSelf(Graphics g){ //画出游戏结束的分数
        if (getGrades()==0){
            g.drawImage(images[0],522,235,25,25,null);
        }else if (getGrades()==1000){
            g.drawImage(images[1],522,235,25,25,null);
            g.drawImage(images[0],542,235,25,25,null);
            g.drawImage(images[0],562,235,25,25,null);
            g.drawImage(images[0],582,235,25,25,null);
        }else if (getGrades()==2000){
            g.drawImage(images[2],522,235,25,25,null);
            g.drawImage(images[0],542,235,25,25,null);
            g.drawImage(images[0],562,235,25,25,null);
            g.drawImage(images[0],582,235,25,25,null);
        }else if (getGrades()==3000){
            g.drawImage(images[2],522,235,25,25,null);
            g.drawImage(images[0],542,235,25,25,null);
            g.drawImage(images[0],562,235,25,25,null);
            g.drawImage(images[0],582,235,25,25,null);
        }
    }


}
