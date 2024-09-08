package ncitchapter2;
import javax.swing.*;

public class OptionPane {
    public static void main(String[] str){
//        Creating Frame 
        JFrame f=new JFrame("Option Pane Example.");
        
//        Creating an OptionPane to Show Error Message
//        JOptionPane.showMessageDialog(f, "Error Message", "Title", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(f, "Error Message", "Title", JOptionPane.INFORMATION_MESSAGE);
        Object[] btn={"OK", "Cancel"};
        JOptionPane.showOptionDialog(f, "Error Message", "Title", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, btn, btn[0]);
//        Setting Size of Frame
        f.setSize(300, 400);
//        Setting Layout of Frame
        f.setLayout(null);
//        Setting Visibility of Frame
        f.setVisible(false);
    }
}
