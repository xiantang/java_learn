package thread;

import model.FeiTan;
import model.Player;
import view.MyFrame;
import view.MyPanel;

//困扰时间巨长的线程
public class JampThread  implements Runnable{
private int kkk=1;


    @Override
    public void run() {
    while (true){
//        System.out.println("dddd");
        try {
            Thread.currentThread().sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        aBoolean_jump  是一个bool值开关
        if(MyPanel.aBoolean_jump){

            for (int i = 0; i <50 ; i++) {
                try{
                    MyFrame.panel.label.repaint();
                    Thread.currentThread().sleep(10);

                    Player.y=Player.y-2;
                }

                catch(Exception ex){

                }
            }
            for (int i = 0; i <25 ; i++) {
                try{
                    MyFrame.panel.label.repaint();
                    Thread.currentThread().sleep(10);

                    Player.y=Player.y+4;
                    if (Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,610,460,20,72)){
                        //一号墙
                        break;
                    }else if (Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,786,460,20,72)){
                        //二号墙
                        break;
                    }else if (Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,622,504,132,22)){
                        //红色砖头
                        break;
                    }else if (Player.getRectangle().intersects(FeiTan.getRectangle())){

                        //飞毯
                        break;
                    }
                    else if (Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,0,287,576,22)){

                        //最长的棍子
                        break;

                    }
                    else if (Player.isCollsionWithRect(Player.x,Player.y,Player.width,Player.height,941,459,44,22)){

                        //第二长的棍子
                        break;
                    }
//                    else if (model.Player.getRectangle().intersects(model.FeiTan.getRectangle())){
//                        //站在毯子上
//                        break;
//                    }
                }

                catch(Exception ex){

                }
            }
            MyPanel.aBoolean_jump=false;


//            while (model.Player.y<=480){
//                view.MyFrame.panel.label.repaint();
//                try{
//
//                    Thread.currentThread().sleep(10);
//
//                    if(model.Player.isCollsionWithRect(model.Player.x,model.Player.y,model.Player.width,model.Player.height,622,460,27,68)==false){
//                        model.Player.y+=4;
//                    }
//
//                    else  if(model.Player.isCollsionWithRect(model.Player.x,model.Player.y,model.Player.width,model.Player.height,622,460,27,68)==true){
//                                break;
//
//                    }
//
//
//                }
//
//
//                catch(Exception ex){
//
//                }
//
//            }
//            System.out.println("往下落的行为终止");
//            if(model.Player.isCollsionWithRect(model.Player.x,model.Player.y,model.Player.width,model.Player.height,622,460,27,68)==false){
//                System.out.println("aa");
//            }





//            if(model.Player.isCollsionWithRect(model.Player.x,model.Player.y,model.Player.width,model.Player.height,622,460,27,68)==true&&(model.Player.x>=572&&model.Player.x<=651)){
//                while (model.Player.y<=480){
//                    try {
//                        Thread.currentThread().sleep(10);
//                            model.Player.y+=4;
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
        }


    }
//        for (int i = 0; i <50 ; i++) {
//
//            view.MyFrame.panel.label.repaint();
//            try{
//
//                Thread.currentThread().sleep(10);
//
//                if(view.MyPanel.aBoolean_right)
//                    model.Player.y--;
//            }
//
//            catch(Exception ex){
//
//            }
//        }
//        for (int i = 0; i <=25 ; i++) {
//            view.MyFrame.panel.label.repaint();
//            try{
//
//                Thread.currentThread().sleep(10);
//                if(view.MyPanel.aBoolean_right)
//                        model.Player.y+=2;
////                if(i==25){view.MyPanel.aBoolean_right=false;}
//
////                }
//
//            }
//
//
//            catch(Exception ex){
//
//            }
//        }
//        view.MyPanel.aBoolean_jump=false;
//        while (true){view.MyFrame.panel.label.repaint(); try {
//            Thread.currentThread().sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//            if(view.MyPanel.aBoolean_jump)
//                model.Player.y--;}


    }



}
