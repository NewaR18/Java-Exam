import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends KeyAdapter {
    JFrame j1=new JFrame("haha");
    JTextField t1=new JTextField(20);
    JCheckBox bh1=new JCheckBox("Tea");
    JCheckBox bh2=new JCheckBox("Coffee");
    JLabel l1=new JLabel("");
    JButton b1=new JButton("Click");
    Main(){
        j1.setTitle("Yoyo");
        j1.setLayout(new FlowLayout(1));
        j1.add(l1);
        j1.add(b1);
        j1.add(t1);
        j1.add(bh1);
        t1.addKeyListener(this);
        j1.setSize(500,500);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
    @Override
    public void keyPressed(KeyEvent e){
        l1.setText("I am typing");
    }

    //Mouse Adapter
    /*@Override
    public void mouseClicked(MouseEvent e){
        l1.setText("Mouse is Clicked");
    }*/

    //Item Listener
   /* @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            l1.setText("Tea is checked");
        }
    }*/


    //Focus Listener
    /*@Override
    public void focusGained(FocusEvent e) {
        l1.setText("Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
l1.setText("Focus Lost");
    }*/
    //Key listener
   /* @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("key typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
l1.setText("key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
l1.setText("Key Released");
    }*/

    //Window Listener
    /*@Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window DeIconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Actiavted");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window DeActiavted");
    }*/

    //MouseListener
    /*@Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse is Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse is Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse is Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse is exited");
    }*/
    //Action Listener
    /*@Override
    public void actionPerformed(ActionEvent e) {
        l1.setText("I am Clicked");
    }*/


}