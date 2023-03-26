import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    JFrame f1=new JFrame("this");
    JMenuBar mb1=new JMenuBar();
    JMenu m1=new JMenu("Science");
    JMenu m2=new JMenu("Management");
    JMenuItem msi1=new JMenuItem("Physics");
    JMenuItem msi2=new JMenuItem("Biology");
    JMenuItem msi3=new JMenuItem("Chemistry");
    JCheckBoxMenuItem cbm1=new JCheckBoxMenuItem("Click");
    JMenuItem mmi1=new JMenuItem("Accounting");
    JMenuItem mmi2=new JMenuItem("Economics");
    JMenuItem mmi3=new JMenuItem("Math");
    JPopupMenu mp1=new JPopupMenu("yoyo");
    JMenuItem i1=new JMenuItem("Copy");
    JMenuItem i2=new JMenuItem("Paste");
    JMenuItem i3=new JMenuItem(("Refresh"));
    Main(){
        f1.setTitle("Chap 2.4");
        f1.setLayout(new FlowLayout(1));
        m1.add(msi1);
        m1.add(msi2);
        m1.add(msi3);
        m1.add(cbm1);
        cbm1.setToolTipText("Don't Click me");
        m2.add(mmi1);
        m2.add(mmi2);
        m2.add(mmi3);
        mb1.add(m1);
        mb1.add(m2);
        mp1.add(i1);
        mp1.add(i2);
        mp1.add(i3);
        f1.add(mb1);
        msi1.setEnabled(false);
        m2.setEnabled(false);
        f1.setSize(500,500);
        f1.addMouseListener(new Handler());
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class Handler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getButton()== MouseEvent.BUTTON3){
            mp1.show(f1,e.getX(),e.getY());
        }
    }
    }
    public static void main(String[] args) {
        new Main();
    }
}