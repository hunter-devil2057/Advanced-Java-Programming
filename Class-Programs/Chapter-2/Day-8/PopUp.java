package ncitchapter2;
import java.awt.event.*;
import javax.swing.*;

public class PopUp {
public static void main(String[] args)    {
        final JFrame f=new JFrame("Menu Example");
//        Defining Popup Menu
        final JPopupMenu file=new JPopupMenu("File");
        
//        Creating obj of JMenu as File
        JMenuItem open=new JMenuItem("Open");       //file
        open.setActionCommand("Open");        
        JMenuItem print=new JMenuItem("Print");       //file
        print.setActionCommand("Print");
        file.add(open);
        file.add(print);
        f.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                file.show(f, e.getX(), e.getY());
            }
        });
        
//        Frame Size
        f.setSize(300, 200);
//        Frame SetLayout
        f.setLayout(null);
//        Frame Set Visibility
        f.setVisible(true);

}
}
