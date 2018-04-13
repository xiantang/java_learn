/**
 * Created by Administrator on 2018/4/11.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class playBall extends JFrame{

    MyPanel mp;
    public static void main(String[] args) {
        playBall pb=new playBall();
    }
    public playBall()
    {
        mp=new MyPanel();
        THREAD thread=new THREAD(mp);
        thread.start();


        this.add(mp);

        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //        this.mp.requestFocus()++++++++++++++++++++++++
    }

}

//定义自己的面板
class MyPanel extends JPanel {
    public static int x = 40;
    public int y = 40;
private Boolean aBoolean=true;
 int i=0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(this.x, this.y, 10, 10);

        if(i==0){
            if(x<200){
                x++;
            }
            else{
                i=1;
            }
        }
        if(i==1){
            if(x>40)
                x--;
            else
                i=0;
        }






    }

}




//        @Override//键被按下
//    public void keyPressed(KeyEvent e) {
//        //System.out.println("被按下"+(char)e.getKeyCode());
//        switch(e.getKeyCode())
//        {
//            case KeyEvent.VK_UP:
//                y-=2;
//                //调用repaint()函数，重新绘制小球位置
//                this.repaint();
//                break;
//            case KeyEvent.VK_DOWN:
//                y+=2;
//                //调用repaint()函数，重新绘制小球位置
//                this.repaint();
//                break;
//            case KeyEvent.VK_LEFT:
//                x-=2;
//                //调用repaint()函数，重新绘制小球位置
//                this.repaint();
//                break;
//            case KeyEvent.VK_RIGHT:
//                x+=2;
//                //调用repaint()函数，重新绘制小球位置
//                this.repaint();
//                break;
//        }
//
//    }

//    @Override//表示具体一个值被输出，例如：F1
//    public void keyTyped(KeyEvent e) {
//        // TODO Auto-generated method stub
//
//    }
//    @Override//键被释放
//    public void keyReleased(KeyEvent e) {
//        // TODO Auto-generated method stub
//
//    }
//}