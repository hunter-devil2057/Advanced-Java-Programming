package ncitchapter2;
import javax.swing.*;

public class ExtendingFrameClass  extends JFrame{
    ExtendingFrameClass(){
//        Creating a new Java Frame, named f
         JFrame f=new JFrame("My Information");
        
//         Creating a new Java Label, named l1
        JLabel l1=new JLabel("Name: Manish Shiwakoti");
//        Setting Bounds for Label l1
        l1.setBounds(20, 20, 200, 20);
//        Adding label l2 to the frame, f
        f.add(l1);
 
//         Creating a new Java Label, named l2
        JLabel l2=new JLabel("Address: Sanothimi, Bhaktapur");
//        Setting Bounds for Label l2
        l2.setBounds(20, 50, 200, 20);
//        Adding label l2 to the frame, f
        f.add(l2);
        
 //         Creating a new Java Label, named l3
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
    public static void main(String[] args)
    {
        new ExtendingFrameClass();
    }
}
