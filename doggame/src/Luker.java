import java.awt.*;

public class Luker extends Rectangle {//地刺类
    public  Rectangle rectangle;

    public Luker(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public void intoPlayer(Rectangle rectangle){
        if (rectangle.intersects(this)){
            System.out.println("角色死亡");
        }

    }
}
