import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Administrator on 2018/3/26.
 */
public class PictureMainFrame extends JFrame{
    private String[] items={"小女孩儿","女明星"};
    private JRadioButton addNumInfo,clearNumInfo;
    private JComboBox<String> box;
    private JButton start;
    private JTextField name;
    private static JTextField step;
    private PictureCanvas canvas;
    private PicturePreview preview;

    public  PictureMainFrame(){
        __init__();
        addComponent();
        addPriviewImage();
        this.setVisible(true);
    }
    private void __init__(){
        this.setTitle("game");
        this.setLocation(150,10);
        this.setSize(1000,720);
        this.setResizable(false);

    }
    private  void  addComponent(){
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,2));
        JPanel leftPanel=new JPanel();
        leftPanel.setBorder(new TitledBorder("按扭区"));
        leftPanel.setBackground(Color.PINK);
        addNumInfo=new JRadioButton("数字提示",false);
        clearNumInfo=new JRadioButton("消除提示",false);
        ButtonGroup buttonGroup=new ButtonGroup();
        box=new JComboBox<String>(items);
        start=new JButton("start");
        buttonGroup.add(addNumInfo);
        buttonGroup.add(clearNumInfo);

        addNumInfo.setBackground(Color.PINK);
        clearNumInfo.setBackground(Color.PINK);
        start.setBackground(Color.pink);
        leftPanel.add(addNumInfo);
        leftPanel.add(clearNumInfo);
        leftPanel.add(new JLabel("    选择图片"));
        leftPanel.add(box);
        leftPanel.add(start);
        panel.add(leftPanel,BorderLayout.WEST);
        JPanel rightPanel=new JPanel();
        rightPanel.setBorder(new TitledBorder("游戏状态"));
        rightPanel.setBackground(Color.pink);
        rightPanel.setLayout(new GridLayout(1,2));
        panel.add(rightPanel,BorderLayout.EAST);
        this.add(panel,BorderLayout.NORTH);
        name=new JFormattedTextField("图片名称：小女孩");
        step=new JTextField("步数:0");
        name.setEditable(false);
        step.setEditable(false);
        rightPanel.add(name,BorderLayout.WEST);
        rightPanel.add(step,BorderLayout.EAST);

    }
    private  void  addPriviewImage(){
        JPanel panel =new JPanel();
        panel.setLayout(new GridLayout(1,2));
        canvas=new PictureCanvas();
        canvas.setBorder(new TitledBorder("拼图区"));
        preview=new PicturePreview();
        preview.setBorder(new TitledBorder("预览区"));
        panel.add(canvas,BorderLayout.WEST);
        panel.add(preview,BorderLayout.EAST);
        this.add(panel,BorderLayout.CENTER);


    }
}
