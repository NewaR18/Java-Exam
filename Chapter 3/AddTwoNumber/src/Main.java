import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    JFrame f1=new JFrame("Haha");
    JLabel l1=new JLabel("Enter First Number");
    JLabel l2=new JLabel("Enter Second Number");
    JLabel l3=new JLabel("Enter Result");
    JTextField t1=new JTextField(20);
    JTextField t2=new JTextField(20);
    JTextField t3=new JTextField(20);
    JTextArea ta1=new JTextArea(20,20);
    JButton b1=new JButton("Add");
    JButton b2=new JButton("Subtract");
    JButton b3=new JButton("Multiply");
    Main(){
        f1.setLayout(new GridLayout(5,2));
        f1.add(l1);
        f1.add(l2);
        /*f1.add(t1);
        f1.add(t2);
        f1.add(l3);f1.add(t3);*/
        f1.add(ta1);
        f1.add(b1);

        b1.addActionListener(this);
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /*@Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_ADD){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 + num2;
            t3.setText(String.valueOf(res));
        }if(e.getKeyCode()==KeyEvent.VK_SUBTRACT){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 - num2;
            t3.setText(String.valueOf(res));
        }

    }*/

    //Event Handling Using Mouse Adapter
    /*@Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource()==b1) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 + num2;
            t3.setText(String.valueOf(res));
        }if(e.getSource()==b2) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 - num2;
            t3.setText(String.valueOf(res));
        }if(e.getSource()==b3) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 * num2;
            t3.setText(String.valueOf(res));
        }
    }*/
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String word2=ta1.getText();
        String[] word3=word2.split("\\s");
        l1.setText(String.valueOf(word2.length()));
        l2.setText(String.valueOf(word3.length));
    }
}