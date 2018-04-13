import javax.swing.*;

public class PaintThread extends Thread{
    public JLabel label;

    public PaintThread(JLabel label) {
        this.label = label;
    }




    @Override
    public void run() {
                while (true) {

            label.repaint();

//            System.out.println('a');
        }
    }
}
