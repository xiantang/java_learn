import javax.swing.*;

/**
 * Created by Administrator on 2018/3/26.
 */
public class Cell extends JButton {
    public Cell(Icon icon) {
        super(icon);
        setIcon(icon);
        setSize(150,150);
    }
    public Cell(String text,Icon icon) {
        super(icon);
        setSize(150,150);
        setIcon(icon);
        setText(text);
//        this.setVerticalTextPosition(1);
    }
}
