package 首页;


import view.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.IDN;


public class First extends JFrame {
    public static int fwhite = 1003;//宽度
    public static int fheight = 600;//高度
    public static int count = 0;
//    public static thread.BulletMusicThread bulletMusicThread;

//    public static int rcount = 0;


    public First(String a) throws InterruptedException{
        String ID = a;
//        BulletMusicThread bulletMusicThread = new BulletMusicThread("src/首页/music/中国国家交响乐团 - 春节序曲.wav");
//        bulletMusicThread.start();
//        Thread thread = new Thread(bulletMusicThread);
        //JPanel kaishi = new JPanel((LayoutManager) new ImageIcon("src/首页/image/开始.png"));
        JLabel bg=new JLabel();
        Icon iconbg=new ImageIcon("src/首页/image/首页.png");     //在此直接创建对象
        bg.setIcon(iconbg);
        bg.setBounds(0, 0, 1003,600);

        JLabel tuijian = new JLabel();
        ImageIcon icontuijian = new ImageIcon("src/首页/image/推荐.png");
        icontuijian.setImage(icontuijian.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
        tuijian.setIcon(icontuijian);
        tuijian.setSize(125,125);
        tuijian.setLocation(427,424);
//        tuijian.setBorder(BorderFactory.createTitledBorder("你好")); 边框线条可以添加文字
        tuijian.addMouseListener(new MouseListener() {
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
                tuijian.setSize(150,150);
                icontuijian.setImage(icontuijian.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
                tuijian.setLocation(415,410);
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成手形状

//                bulletMusicThread.interrupt();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tuijian.setSize(125,125);
                icontuijian.setImage(icontuijian.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
                tuijian.setLocation(427,424);
                setCursor(Cursor.getDefaultCursor());//鼠标原始
            }
        });

        JLabel kaishi = new JLabel();
        ImageIcon iconkaishi = new ImageIcon("src/首页/image/开始.png");
        iconkaishi.setImage(iconkaishi.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
        kaishi.setIcon(iconkaishi);
        kaishi.setSize(125,125);
        kaishi.setLocation(427,275);
//        view.MyFrame myFrame = new view.MyFrame();
        kaishi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                //把id作为名字闯入
                new MyFrame(ID);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                kaishi.setSize(150,150);
                iconkaishi.setImage(iconkaishi.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
                kaishi.setLocation(415,261);
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成手形状
            }

            @Override
            public void mouseExited(MouseEvent e) {
                kaishi.setSize(125,125);
                iconkaishi.setImage(iconkaishi.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT));
                kaishi.setLocation(427,275);
                setCursor(Cursor.getDefaultCursor());//鼠标原始
            }
        });



        JLabel Musicopen = new JLabel();
        ImageIcon iconMusicopen = new ImageIcon("src/首页/image/喇叭开启.png");
        iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(74,74,Image.SCALE_DEFAULT));
        Musicopen.setIcon(iconMusicopen);
        Musicopen.setSize(74,74);
        Musicopen.setLocation(925,8);

        Musicopen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
               count+=1;
               if(count%2!=0){
                   ImageIcon iconMusicopen = new ImageIcon("src/首页/image/喇叭关闭.png");
                   iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(74,74,Image.SCALE_DEFAULT));
                   Musicopen.setIcon(iconMusicopen);
                   Musicopen.setSize(74,74);
                   Musicopen.setLocation(925,8);
                   setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成手形状
//                   bulletMusicThread.exit = true;
//                   bulletMusicThread.stop();
//                   if(bulletMusicThread.exit = true){
//                       System.out.println("线程中断");
//                   }


               }else{
                   ImageIcon iconMusicopen = new ImageIcon("src/首页/image/喇叭开启.png");
                   iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(74,74,Image.SCALE_DEFAULT));
                   Musicopen.setIcon(iconMusicopen);
                   Musicopen.setSize(74,74);
                   Musicopen.setLocation(925,8);
                   setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成手形状

                   new BulletMusicThread("src/首页/music/中国国家交响乐团 - 春节序曲.wav").start();
                   System.out.println("线程开启");
               }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                rcount++;
//                if(rcount%2!=0){
//                    ImageIcon iconMusicopen = new ImageIcon("src/首页/image/喇叭关闭.png");
//                    iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
//                    Musicopen.setIcon(iconMusicopen);
//                    Musicopen.setSize(80,80);
//                    Musicopen.setLocation(922,4);
//                }else{
//                    ImageIcon iconMusicopen = new ImageIcon("src/首页/image/喇叭关闭.png");
//                    iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
//                    Musicopen.setIcon(iconMusicopen);
//                    Musicopen.setSize(80,80);
//                    Musicopen.setLocation(922,4);
//                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成手形状
//                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                Musicopen.setSize(80,80);
//                iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
//                Musicopen.setLocation(922,4);
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成手形状
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                Musicopen.setSize(74,74);
////                iconMusicopen.setImage(iconMusicopen.getImage().getScaledInstance(74,74,Image.SCALE_DEFAULT));
////                Musicopen.setLocation(922,10);
               setCursor(Cursor.getDefaultCursor());//鼠标原始
            }
        });




        add(Musicopen);
        add(tuijian);
        add(kaishi);

        add(bg);
//        new thread.BulletMusicThread("src/首页/music/中国国家交响乐团 - 春节序曲.wav").main.start();
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();//计算电脑尺寸居中
        setBounds(((int)screenSize.getWidth() - fwhite) / 2, 0, fwhite, fheight);//计算电脑尺寸居中
        setTitle("小狗抢红包     ID: "+ID);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
