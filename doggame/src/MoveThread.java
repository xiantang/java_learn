import javax.swing.*;
import java.awt.*;

public class MoveThread implements Runnable {

    public MyPanel panel;
    public Player player;
    public  UpThread Upthread;
    public MoveThread(MyPanel panel, Player player) {
        this.panel = panel;
        this.player = player;

    }

    @Override
    public void run() {

        while (true) {
            this.Upthread = new UpThread(player);
            try {

                Thread.currentThread().sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            System.out.println(player.Left);
//            System.out.println(player.Right);

            if (player.Up==1) {
                System.out.println("up");
                player.Up=0;
                Upthread.start();
//                Upthread.resume();
//                Upthread.join();

            } else if (player.Right) {
                new Thread();
                try {
                    Thread.currentThread().sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("OK");
//                System.out.println(Player.x);
                Player.x += 10;
            } else if (player.Left) {
                try {
                    Thread.currentThread().sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("OK");
//                System.out.println(Player.x);
                Player.x -= 10;
            }

        }
    }


}
