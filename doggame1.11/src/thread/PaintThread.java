package thread;

import model.*;
import view.MyLable;

import javax.swing.*;

public class PaintThread extends Thread{
    public JLabel label;
    public static   int timer = 0;
    public  static int kkkk=0;
    public  static int jjjj=0;
    public PaintThread(JLabel label) {
        this.label = label;
    }

    public  void  paintGameOver(){
        while (GameOver.gameover_x>=300){
            try {
                Thread.sleep(3);MyLable.zhuanTou=3;label.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GameOver.gameover_x--;
            kkkk=1;
            if(GameOver.gameover_x==300){
                jjjj=1;
            }

        }


        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();

        while (true) {
//            System.out.println(1);
            timer++;
            if(timer==10000){
                timer=0;
            }
//——---------------————改变毯子的翻动的切换
            if (timer % 50 == 0) {

                FeiTan.n++;
                if(FeiTan.n>=FeiTan.images.length){
                    FeiTan.n=0;
                }
            }

            if (FeiTan.i == 0) {
                if (FeiTan.x < 820) {//移动位置
                    {
                        FeiTan.x++;
                        if (Player.getRectangle().intersects(FeiTan.getRectangle())){
                            Player.x++;
                        }
                    }
                } else {
                    FeiTan.i = 1;
                }
            }
            if (FeiTan.i == 1) {
                if (FeiTan.x > 600)//移动位置{
                { FeiTan.x--;
                    if (Player.getRectangle().intersects(FeiTan.getRectangle())){
                        Player.x--;
                    }
                }

                else
                    FeiTan.i = 0;
            }

//    ---------------------------------子弹的设置

            if(FeiTan.j==0){
                if(FeiTan.m<=1003){//移出屏幕前一直运动
                    FeiTan.m++;
                }
                else{
                    FeiTan.j=1;
                }
            }
            if(FeiTan.j==1){ //当x==1003 x重置
                FeiTan.m=0;
                FeiTan.j=0;
            }

//-----------------------喷火的的位置和速度设置
            if (FeiTan.penghuo_states== 0) {
                if (PengHuo.penghuo_y>=200) {//移动位置
                    PengHuo.penghuo_y--;
                } else {
                    FeiTan.penghuo_states= 1;
                }
            }
            if (FeiTan.penghuo_states== 1) {
                if (PengHuo.penghuo_y <510)//移动位置
                    PengHuo.penghuo_y++;
                else
                    FeiTan.penghuo_states= 0;
            }
            if(PengHuo.penghuo_y>=200&PengHuo.penghuo_y<=250){
                PengHuo.penghuo_index=1;
            }
            else {
                PengHuo.penghuo_index=0;
            }

            label.repaint();
            try {
                Thread.sleep(10);
//                改毯子飞的速度
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


//角色死亡  gameover跳出
//            1号地刺
                if(Player.isCollsionWithRect(Player.x,Player.y,70,50,220,512,10,2)||Player.getRectangle().intersects(FeiTan.getRectangle_zidan())){

                paintGameOver();
            }
            //角色死亡  gameover跳出
//            碰到子弹死掉
            if(model.Player.getRectangle().intersects(model.FeiTan.getRectangle_zidan())){

                paintGameOver();


            }
            if(model.Player.getRectangle().intersects(model.PengHuo.getRectangle())){
//                碰到  喷火死掉


                paintGameOver();
            }

        }
    }
}
