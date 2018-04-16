public class UpThread extends Thread {
    Player player;

    public UpThread(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        player.Up=0;

            try {
//                System.out.println("向上");


                for (int i = 0; i <50 ; i++) {
                    Thread.currentThread().sleep(10);
                    Player.y-=3;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//                System.out.println("OK");
//                System.out.println(Player.x);
            try {
//                System.out.println("向下");
                for (int i = 0; i <30 ; i++) {
                    Thread.currentThread().sleep(10);
                    Player.y+=5;
                    if (player.getRectangle().intersects(new BaseStone(677,490,30,72)))break;
                    //红色的砖头
                    if (player.getRectangle().intersects(new BaseStone(614,448,30,72)))break;
                    //1号墙
                    if (player.getRectangle().intersects(new BaseStone(782,448,20,72)))break;
                    //2号墙
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//                 player.Up=true;
        player.Up=-1;
        }
    }

