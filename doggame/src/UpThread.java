public class UpThread extends Thread {
    @Override
    public void run() {


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
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//                 player.Up=true;

        }
    }

