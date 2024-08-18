package ncitchapter2;
import javax.swing.*;

public class NcitChapter2 {
    public static void main(String[] args) {
//        Defining a new Frame named f
        JFrame f=new JFrame("My Project");
        
//        Displaying a New Label, l1
          JLabel l1=new JLabel("Advanced Java Programming");
//          setBounds for Label 

           l1.setBounds(20, 20, 200, 20);
//           Shifting 20px from left, 20px from top and width=200px and height=20px
//                Syntax: setBounds(x, y, width, height);

//           Adding to the frame
           f.add(l1);
//           Setting the size of the frame 
           f.setSize(300, 400);
           
//           Setting layout as null
           f.setLayout(null);
           
//Setting visibility to true           
           f.setVisible(true);
    }
    
}
