import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JLabel l1=new JLabel("yoyo");
    JTextField t1=new JTextField(20);
    JPasswordField p1=new JPasswordField(20);
    JTextArea ta1=new JTextArea(10,10);
    JScrollPane sp1=new JScrollPane(ta1);
    JCheckBox c1=new JCheckBox("Tea");
    JCheckBox c2=new JCheckBox("Coffee");
    JRadioButton r1=new JRadioButton("Dew");
    JRadioButton r2=new JRadioButton("Fanta");
    ButtonGroup bt1=new ButtonGroup();
    String[] arry=new String[]{"Sudip","Yoyo"};
    JComboBox CB1=new JComboBox(arry);
    JSlider sl1=new JSlider();

    Main(){
        setTitle("Chap2.3");
        setLayout(new FlowLayout(1));
        add(l1);
        t1.setBorder(BorderFactory.createLineBorder(Color.red));
        add(t1);
        add(p1);
        add(sp1);
        sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(c1);
        add(c2);
        bt1.add(r1);
        bt1.add(r2);
        add(r1);
        add(r2);
        add(CB1);
        add(sl1);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}