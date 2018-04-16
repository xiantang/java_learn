public class Gravity  extends Thread{
    public  Player player;

    public Gravity(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.currentThread().sleep(10);
                if (player.getRectangle().intersects(new BaseStone(0,520,985,34))){
//                    System.out.println("接触地面");
                }else if (player.getRectangle().intersects(new BaseStone(677,490,80,23))){
                        //红色砖头
                }else if (player.getRectangle().intersects(new BaseStone(610,448,30,72))){
                        //一号墙
                }else if (player.getRectangle().intersects(new BaseStone(788,448,20,72))){
                    //二 号墙
                }
                else if (player.Up==0){

                }

                else Player.y+=5;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}}
