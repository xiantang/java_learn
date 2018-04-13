


import javax.crypto.interfaces.PBEKey;

/**
 * Created by Administrator on 2018/4/11.
 */
public class THREAD extends Thread{
    public MyPanel myPanel;
    public THREAD(MyPanel mypanel) {
        this.myPanel = mypanel;
    }
    @Override

    public void run() {
        while (true){
            myPanel.repaint();
//            MyPanel.x++;

            try{
                this.currentThread().sleep(10);
            }
            catch (Exception e){
                e.printStackTrace();
        }
        }
    }
}
