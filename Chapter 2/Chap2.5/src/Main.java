import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main{
    String[][] data=new String[][]{{"Yoyo","Yoyo2"},{"Yoyo3","Yoyo4"}};
    String[] ColumnName=new String[]{"SayYoyo","SayYoyo2"};
    JFrame f1=new JFrame("Chap 2.5");
    JFileChooser fc1=new JFileChooser("C://");
    JColorChooser cc1=new JColorChooser();
    JTable t1=new JTable(data,ColumnName);
    Main(){
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        JOptionPane.showMessageDialog(f1,"Hello");
        int a=JOptionPane.showConfirmDialog(f1,"you Sure you want to open it?");
        f1.add(fc1);
        f1.add(t1);
        Color cc=cc1.showDialog(f1,"Select Color",Color.red);
        f1.setVisible(true);
        if(a==JOptionPane.NO_OPTION){
            f1.setVisible(false);
            String b=JOptionPane.showInputDialog(f1,"Why?");
        }
        f1.setSize(500,500);

        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}