package com.mycompany.chapter3;
import javax.swing.*;
import java.awt.event.*;

//public class Chapter3 implements MouseListener {
public class Chapter3 extends MouseAdapter {
JFrame f;
JTextField t1, t2;
JLabel l1;
Chapter3(){
    f=new JFrame();
    System.out.println("Enter First Number:");
    t1=new JTextField();
    t1.setBounds(20, 20, 100, 15);
    f.add(t1);
    System.out.println("Enter Second Number:");
    t2=new JTextField();
    t2.setBounds(20, 60, 100, 15);
    f.add(t2);
    
    l1=new JLabel("Result: ");
    l1.setBounds(20, 100, 100, 15);
    f.add(l1);
//    Adding Listener in the Frame
    f.addMouseListener(this);
    f.setSize(200, 300);
    f.setLayout(null);
    f.setVisible(true);
}
    public static void main(String[] args) {
        new Chapter3();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            l1.setText("Sum="+(num1+num2));
    }
    @Override
    public void mouseReleased(MouseEvent e) {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            l1.setText("Difference="+(num1-num2));
    }
//    @Override
//    public void mouseEntered(MouseEvent e) {}
//    @Override
//    public void mouseExited(MouseEvent e) {}
}