package model;

import thread.PaintThread;
import view.MyFrame;

public class clock implements Runnable {
//    实例化秒，分
    private display seconds = new display(60);
    private display minutes = new display(60);
    public  static  String s ;



    @Override
    public void run() {
        while (true) {
            if(PaintThread.kkkk==0){
                try {
//                每一秒钟更新一次
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            秒加
                seconds.increase();
//            加到limit 会至于0 则上一位加1
                if (seconds.getvalue() == 0)
                    minutes.increase();
//      .format 的功能就是出现00：00效果
                s=String.format("%02d:%02d",minutes.getvalue(),seconds.getvalue());
//            改变lable的文字 把时钟加进去
                MyFrame.jLabel.setText(s);

            }
        }



    }
}
