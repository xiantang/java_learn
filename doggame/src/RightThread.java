public class RightThread implements Runnable {
    public MyPanel panel;

    public RightThread(MyPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {

        for (int i = 0; i <50 ; i++) {

            panel.label.repaint();
            try{

                Thread.currentThread().sleep(10);
                Player.x++;
            }

            catch(Exception ex){

            }
        }

    }

}
