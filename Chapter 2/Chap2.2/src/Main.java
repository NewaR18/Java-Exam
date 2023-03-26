import javax.swing.*;
import java.awt.*;

class NoLayout extends JFrame{
    JLabel l1=new JLabel("Yoyo");
    JLabel l2=new JLabel("Yoyo2");
    JTextField t1=new JTextField(10);
    JTextField t2= new JTextField(10);
    JButton b1=new JButton("Print");
    GridBagConstraints v1=new GridBagConstraints();
    JPanel p1=new JPanel();
    GroupLayout gl1=new GroupLayout(p1);
    NoLayout(){
        setTitle("No Layout");

        //FlowLayout
        /*setLayout(new FlowLayout(FlowLayout.CENTER));*/

        //No Layout
        /*setLayout(null);
        l1.setBounds(50,50,200,50);
        l2.setBounds(100,50,200,50);
        t1.setBounds(150,50,50,50);
        t2.setBounds(200,50,50,50);
        b1.setBounds(250,50,200,50);*/

        //Grid Layout
        /*setLayout(new GridLayout(3,2,1,1));*/

        //GridBag Layout
        /*setLayout(new GridBagLayout());
        v1.gridx=0;
        v1.gridy=0;
        add(l1,v1);
        v1.gridx=1;
        v1.gridy=0;
        add(l2,v1);
        v1.gridx=2;
        v1.gridy=0;
        add(t1,v1);
        v1.gridx=0;
        v1.gridy=1;
        add(t2,v1);
        v1.gridx=1;
        v1.gridy=1;
        v1.gridwidth=2;
        add(b1,v1);*/ //Do not add the components below if its already added here

        //BorderLayout
        /*setLayout(new BorderLayout());
        add(l1,BorderLayout.WEST);
        add(l2,BorderLayout.EAST);
        add(t1,BorderLayout.NORTH);
        add(t2,BorderLayout.SOUTH);
        add(b1,BorderLayout.CENTER);*/ //Do not add the components below if its already added here

        //GroupLayout
        gl1.setHorizontalGroup(gl1.createSequentialGroup().addComponent(l1).addComponent(l2));
        gl1.setVerticalGroup(gl1.createSequentialGroup().addComponent(l1).addComponent(l2));
        p1.setLayout(gl1);
        add(p1);
        /*add(l1);add(l2);add(t1);add(t2);add(b1);*/
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
public class Main {
    public static void main(String[] args) {
        new NoLayout();
    }
}