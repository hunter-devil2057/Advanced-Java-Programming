package ncitchapter2;
import javax.swing.*;

public class DisplayInfo {
    public static void main(String[] args){
//        Creating a new frame, named f
        JFrame f=new JFrame("My Information");
        
//        Creating a new Label l1, inside the Frame f
        JLabel l1=new JLabel("Name: Manish Shiwakoti");
//        Setting Bounds for Label l1
        l1.setBounds(20, 20, 200, 20);
//        Adding label l2 to the frame, f
        f.add(l1);
        
//        Creating a new Label l2, inside the Frame f
        JLabel l2=new JLabel("Address: Sanothimi, Bhaktapur");
//        Setting Bounds for Label l2
        l2.setBounds(20, 50, 200, 20);
//        Adding label l2 to the frame, f
        f.add(l2);
        
//        Creating a new Label l3, inside the Frame f
        JLabel l3=new JLabel("Email: manishshiwakoti42@gmail.com");
//        Setting Bounds for Label l3
        l3.setBounds(20, 80, 300, 20);
//        Adding label l2 to the frame, f
        f.add(l3);
        
//        Setting the size of frame, f.setSize(width, height);
        f.setSize(300, 400);
//        Setting Layout of the frame, f,     f.setLayout(null);
        f.setLayout(null);
//        Setting Visibility of the frame, f,   f.setVisibility(true);
        f.setVisible(true);
    }
}
