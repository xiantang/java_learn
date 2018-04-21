package view;

import model.*;
import thread.BulletMusicThread;
import thread.PaintThread;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MyLable extends JLabel {
    public int width;
    public int height;
    public static Player player;
    public FeiTan feiTan;
    public static int zhuanTou=0;
    public RedPacket redPacket1,redPacket2,redPacket3;
    PengHuo pengHuo;
    public static Grades grades;
    public  static GameOver gameOver;
    public static  PaintThread thread;
    public  String username;
    BulletMusicThread bulletMusicThread;
    public  static Image bg=new ImageIcon("imges/地图.png").getImage();
    public MyLable(int width, int height,String username) {
        this.width = width;
        this.height = height;
        this.username=username;
        player= new Player(0,480,username);
        feiTan=new FeiTan();

        pengHuo=new PengHuo();
        this.grades =new Grades();
        gameOver =new GameOver(grades);
        thread =new PaintThread(this);
        thread.start();
        Gravity gravity=new Gravity(player);
        gravity.start();
        redPacket1=new RedPacket(330,480,26,31);
        redPacket2=new RedPacket(540,480,26,31);
        redPacket3=new RedPacket(695,460,26,31);


//        new thread.BulletMusicThread("imges/02-春风一顾.wav").main.start();


    }
    public  void  reset(){
        redPacket1=new RedPacket(330,480,26,31);
        redPacket2=new RedPacket(540,480,26,31);
        redPacket3=new RedPacket(695,460,26,31);
    }//重新设置红包的位置
    @Override
    public void paint(Graphics g) {

        g.drawImage(bg,0,0,width,height-40,null); //画出背景

        player.drawSelf(g);
        feiTan.drawself_feiTan(g);
        gameOver.drawself_gameover(g);
        if(Player.score==0){
            reset();
        }//如果人物分数

        if (Player.getRectangle().intersects(redPacket1)){
            redPacket1.x=10000; //吃了红包之后直接把红包移到外面
            Player.score+=1000;
//            System.out.println(player.score);
        }else if (Player.getRectangle().intersects(redPacket2)){
            redPacket2.x=10000;
            Player.score+=1000;
//            System.out.println(player.score);
        }else if (Player.getRectangle().intersects(redPacket3)){
            redPacket3.x=10000;
            Player.score+=1000;

//            System.out.println(player.score);
        }
//        System.out.println(model.Player.score);
        grades.drawSelf(g);

        //同级的if
        if (redPacket1.visible) {
            redPacket1.drawSelf(g);
        }
        if(redPacket2.visible){
            redPacket2.drawSelf(g);
        }if(redPacket3.visible){
            redPacket3.drawSelf(g);
        }
        redPacket2.drawSelf(g);
        redPacket3.drawSelf(g);
        pengHuo.drawself_PengHuo(g);

}



}
