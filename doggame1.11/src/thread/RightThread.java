package thread;

import model.Player;
import view.MyFrame;
import view.MyLable;
import view.MyPanel;

public class RightThread implements Runnable {


    public RightThread() {

    }

    @Override
    public void run() {
        while (true) {
            MyFrame.panel.label.repaint();
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean first_left=Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,622,460,25,68);
            boolean second_left=Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,786,460,25,68);
            boolean first_right=Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,622,460,15,68);
            boolean first_to_bool=Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,630,460,15,68);
            boolean second_right=Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,786,460,15,68);
            boolean second_to_bool=Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,796,460,15,68);
            if (MyPanel.aBoolean_right) {

                if(first_right==false&&second_right==false&&Player.x>=-10&&Player.x<=915){
                    Player.x+=2;//一号柱子

                }
                if(first_right==true&&(Player.y<=415)){
                    Player.x+=2;

                }

                if(second_right==true&&(Player.y<=415)){
                    Player.x+=2;

                }
//改变狗的数组下标
                MyLable.zhuanTou=0;
//                System.out.println("按了右键");
//                通过x坐标的改变的值  也就是可以理解为速度  速度越快 行走的两张图摆腿速度也更快
                if(MyLable.player.x%10==0){
                    MyLable.zhuanTou=2;
                }

            }
            if (MyPanel.getaBoolean_left) {
                if(first_to_bool==false&&second_to_bool==false&&Player.x>=0&&Player.x<=920){
                    Player.x-=2;//一号柱子
                }

                if(first_left==true&&Player.y<=415){
                    Player.x-=2;

                }
                if(second_left==true&&Player.y<=415){
                    Player.x-=2;

                }//为了让狗在障碍物上走

                MyLable.zhuanTou=1;
                if(MyLable.player.x%10==0){
                    MyLable.zhuanTou=4;
                }

            }


        }

    }

}
