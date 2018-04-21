package view;

import db.Sqlserver;
import model.Player;
import model.clock;
import thread.JampThread;
import thread.PaintThread;
import thread.RightThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MyFrame extends JFrame{
    public static MyPanel panel;
    public static int width=1003;
    public static int height=600;
    public   static  JLabel jLabel;
    public  static int tuijian_x=568 ;
    public static  int tuijian_y=263;
    public  static int gong_9_x=347 ;
    public static  int gong_9_y=263;
    public  static int game_9_x=454 ;
    public static  int game_9_y=263;
    public static JLabel tuijian;
    public  static  boolean aBoolean_tuijian=false;
    public  static  boolean aBoolean_gezi_9=false;
    public  static  boolean aBoolean_game_9=false;
    public  rank rank=new rank();
    public  String userName;


    public MyFrame(String ID) throws HeadlessException {
        userName=ID;
        GameOver_9(tuijian,tuijian_x,tuijian_y);
        GameOver_9_gong(tuijian,gong_9_x,gong_9_y);
        GameOver_9_game(tuijian,game_9_x,game_9_y);


        jLabel =new JLabel("",JLabel.CENTER);
        jLabel.setForeground(new Color(254,67,101));
        jLabel.setFont(new Font("楷体",Font.BOLD,40));
        jLabel.setBounds(0,0,400,200);
        this.getLayeredPane().add(jLabel,new Integer(200));
        ((JPanel)this.getContentPane()).setOpaque(false);

        setTitle("小狗抢红包     ID: "+ID);
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
        setBounds( ((int)screenSize.getWidth() - width) / 2, 0, width, height);
        setLayout(null);
        panel=new MyPanel(width,height,ID);


//        this.add(panel);
        this.getLayeredPane().add(panel,new Integer(100));
        this.setVisible(true);

        panel.requestFocus();

//        如果人物死了



        JampThread jampThread = new JampThread();
        Thread thread = new Thread(jampThread);
        thread.start();

        RightThread rightThread = new RightThread();
        Thread thread1 =new Thread(rightThread);
        thread1.start();
        clock c=new clock();
//        c.main.start();
        Thread thread1666 =new Thread(c);
        thread1666.start();




        //  requestFocus 一定要放在setVisible后面
    }

//    9999999 regame
    public void GameOver_9(JLabel jLabel,int x,int y){
        jLabel=new JLabel();
        ImageIcon icontuijian = new ImageIcon("src/登录界面/image/开始的副本.png");
        icontuijian.setImage(icontuijian.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
        jLabel.setIcon(icontuijian);
        jLabel.setLocation(x,y);
        jLabel.setSize(125,125);
        this.getLayeredPane().add(jLabel,new Integer(50));

        JLabel finalJLabel = jLabel;
        jLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //关闭所有开关
                Sqlserver sqlserver=new Sqlserver();
                sqlserver.insertDb(Player.name,clock.s,Player.score);
                PaintThread.kkkk=0;
                MyLable.player.x=0;
                MyLable.player.y=480;
                MyLable.gameOver.gameover_x=1003;
                MyLable.gameOver.gameover_y=40;
                MyLable.zhuanTou=0;
                PaintThread.jjjj=0;
                Player.score=0;

            }


            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                aBoolean_tuijian=true;
                finalJLabel.setSize(150,150);
                if(PaintThread.jjjj==1){setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}
                //鼠标变成手形状

            }

            @Override
            public void mouseExited(MouseEvent e) {
                aBoolean_tuijian=false;

            }
        });

    }
    public void GameOver_9_gong(JLabel jLabel,int x,int y){
        jLabel=new JLabel();
        ImageIcon icontuijian = new ImageIcon("src/登录界面/image/开始的副本.png");
        icontuijian.setImage(icontuijian.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
        jLabel.setIcon(icontuijian);
        jLabel.setLocation(x,y);
        jLabel.setSize(125,125);
        this.getLayeredPane().add(jLabel,new Integer(50));

        JLabel finalJLabel = jLabel;
        jLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }


            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                aBoolean_gezi_9=true;
                finalJLabel.setSize(150,150);
                if(PaintThread.jjjj==1){setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}
                //鼠标变成手形状

            }

            @Override
            public void mouseExited(MouseEvent e) {
                aBoolean_gezi_9=false;

            }
        });

    }

    public void GameOver_9_game(JLabel jLabel,int x,int y){
        jLabel=new JLabel();
        ImageIcon icontuijian = new ImageIcon("src/登录界面/image/开始的副本.png");
        icontuijian.setImage(icontuijian.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
        jLabel.setIcon(icontuijian);
        jLabel.setLocation(x,y);
        jLabel.setSize(125,125);
        this.getLayeredPane().add(jLabel,new Integer(50));

        JLabel finalJLabel = jLabel;
        jLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {





//                System.out.println("aaaaaaaaaa");new view.MyFrame();

            }


            @Override
            public void mousePressed(MouseEvent e) {
                rank.setBounds(0,0,500,500);

                getLayeredPane().add(rank,new Integer(400));
                rank.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                rank.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                aBoolean_game_9=true;
                finalJLabel.setSize(150,150);
                if(PaintThread.jjjj==1){setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}
                //鼠标变成手形状

            }

            @Override
            public void mouseExited(MouseEvent e) {
                aBoolean_game_9=false;

            }
        });

    }

}
