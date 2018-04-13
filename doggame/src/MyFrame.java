import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MyFrame extends JFrame {
    public MyPanel panel;
    public static int width=1003;
    public static int height=600;

//    public  static Image bg=Toolkit.getDefaultToolkit().getImage("imges/地图.png");

    public MyFrame() throws HeadlessException {
        setTitle("小狗抢红包刺激版");
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
        setBounds( ((int)screenSize.getWidth() - width) / 2, 0, width, height);
//        setLayout(null);


        panel=new MyPanel(width,height);


//        panel.setBounds(0,0,width,height);

        this.add(panel);

//        panel.repaint();
        this.setVisible(true);
//        this.setResizable(false);
        panel.requestFocus();
        // 日啊 requestFocus 一定要放在setVisible后面
    }
}
