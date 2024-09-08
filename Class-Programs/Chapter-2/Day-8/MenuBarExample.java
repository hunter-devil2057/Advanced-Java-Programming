package ncitchapter2;
import javax.swing.*;

public class MenuBarExample {
    public static void main(String[] args){
        JFrame f=new JFrame("Menu Example");
//        Defining Menu Bar
        JMenuBar bar=new JMenuBar();
        
//        Creating obj of JMenu as File
        JMenu file=new JMenu("File");       //file
        bar.add(file);
//        Menu Items inside the JMenu
        JMenuItem open=new JMenuItem("Open");
        JMenuItem exportFile=new JMenuItem("Export File");
        
//        Creating Close as Menu as it has sub-menus too.....
        JMenu close=new JMenu("Close");
        
//        Sub-Menus of Menu Close
        JMenuItem i1=new JMenuItem("Item1");
        JMenu i2=new JMenu("Item2");
        JMenuItem i5=new JMenuItem("Item5");
        JMenuItem i6=new JMenuItem("Item6");
        i2.add(i5);
        i2.add(i6);
        JMenuItem i3=new JMenuItem("Item3");
        JMenuItem i4=new JMenuItem("Item4");
        close.add(i1); 
        close.add(i2); 
        close.add(i3); 
        close.add(i4); 
        file.add(open);
        file.add(exportFile);
        file.add(close);
        

//        Creating obj of JMenu as Edit
        JMenu edit=new JMenu("Edit");       //file
        bar.add(edit);
//        Menu Items inside the JMenu
        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem redo=new JMenuItem("Redo");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        edit.add(undo);
        edit.add(redo);
        edit.add(copy);
        edit.add(paste);
        
//        Adding Menubar to the frame
        f.setJMenuBar(bar);
//        Frame Size
        f.setSize(300, 200);
//        Frame SetLayout
        f.setLayout(null);
//        Frame Set Visibility
        f.setVisible(true);
    }
}
