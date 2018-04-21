package view;

import thread.PaintThread;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MyPanel extends JPanel  implements KeyListener{
    public int PanelWidth;
    public  int PanelHeight;
    public  JLabel label;
    public static Boolean aBoolean_right=false;
    public  static Boolean aBoolean_jump=false;
    public  static Boolean getaBoolean_left=false;
    public String username;


    public MyPanel(int panelWidth, int panelHeight ,String name) {
        setLayout(null);
        this.PanelWidth = panelWidth;
        this.PanelHeight = panelHeight;
        this.username=name;
        setBounds(0,0 ,PanelWidth,PanelHeight);
        label=new MyLable(PanelWidth,PanelHeight,name);

        label.setBounds(0,0,PanelWidth,PanelHeight);
        this.addKeyListener(this);

        add(label);

//        label.setBounds(0,0,PanelWidth,PanelHeight);
//        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_SPACE) {
            if(PaintThread.kkkk==0)
            aBoolean_jump=true;
////            if(aBoolean_jump){
//                thread.JampThread jampThread = new thread.JampThread();
//                Thread thread = new Thread(jampThread);
//                thread.main.start();
//
////            }

//            thread.interrupt();



        }
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(PaintThread.kkkk==0)
            aBoolean_right=true;




            }
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            if(PaintThread.kkkk==0)
            getaBoolean_left=true;



        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){aBoolean_right=false;
//            System.out.println("释放了右键");
}
//        if (e.getKeyCode()==KeyEvent.VK_SPACE) {aBoolean_jump=false;}
        if (e.getKeyCode()==KeyEvent.VK_LEFT) {getaBoolean_left=false;}
    }
//
//    protected void paintComponent(Graphics g) {
////        super.paintComponent(g);
//
//    }
}
