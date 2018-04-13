import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MyLable extends JLabel {
    public int width;
    public int height;
    public Player player;
    public RedPacket redPacket1,redPacket2;
    public  static Image bg=new ImageIcon("src/imges/地图.png").getImage();
//    public  static Image image=new ImageIcon("src/imges/狗子正.png").getImage();
    public MyLable(int width, int height,Player player) {
        this.width = width;
        this.height = height;
        this.player=player;
        redPacket1=new RedPacket(330,480,26,31);
        redPacket2=new RedPacket(540,480,26,31);
//        repaint();
    }
 
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        System.out.println(this.getHeight());
        g.drawImage(bg,0,0,width,height-40,null); //画出背景
        if (player.getRectangle().intersects(redPacket1)){
            redPacket1.visible=false;
        }else if (player.getRectangle().intersects(redPacket2)){
            redPacket2.visible=false;
        }
        if (redPacket1.visible) {
            redPacket1.drawSelf(g);
        }
        if(redPacket2.visible){
            redPacket2.drawSelf(g);
        }
        //如果是true 就画出自己

        Luker lukerFirst =new Luker(192,512,51,10);
        lukerFirst.intoPlayer(player.getRectangle());
        Luker lukerSecond =new Luker(406,512,51,10);
        lukerFirst.intoPlayer(player.getRectangle());
        lukerSecond.intoPlayer(player.getRectangle());
//        g.drawImage(player.image,0,0,100,100,null);
        player.drawSelf(g);
        setVisible(true);
    }


}
