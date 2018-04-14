import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MyPanel extends JPanel implements KeyListener {
    public int PanelWidth;
    public int PanelHeight;
    public JLabel label;
    public Player player;
    public Thread thread1;
    public MoveThread moveThread;

    public MyPanel(int panelWidth, int panelHeight) {
        setLayout(null);
        this.PanelWidth = panelWidth;
        this.PanelHeight = panelHeight;

        player = new Player(0, 480);
        label = new MyLable(PanelWidth, PanelHeight, player);

        label.setBounds(0, 0, PanelWidth, PanelHeight);
        PaintThread thread = new PaintThread(label);
        thread.start();
        moveThread = new MoveThread(this, player);
        thread1 = new Thread(moveThread);
        thread1.start();
        setBounds(0, 0, PanelWidth, PanelHeight);

        this.addKeyListener(this);

        add(label);

//        label.setBounds(0,0,PanelWidth,PanelHeight);
//        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println('a');
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.Left = true;
//            System.out.println("向左");


        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.Right = true;
//            System.out.println("向右");


        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {

//
            if (player.Up==-1){
                player.Up=1;
            }

//
//
//            System.out.println(moveThread.Upthread.isAlive()+"fsdsdfsdsdf");

            }
        }


    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.Left = false;

//

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.Right = false;
//            System.out.println("向右");


        }
        //松开键盘 如果线程还存活就设置为false

    }
//
//    protected void paintComponent(Graphics g) {
////        super.paintComponent(g);
//
//    }
}
