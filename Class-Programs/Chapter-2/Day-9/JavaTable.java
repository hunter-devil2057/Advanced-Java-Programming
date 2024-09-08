import javax.swing.*;
public class JavaTable {
    JFrame f;
//    Creating a Constructor 
    JavaTable(){
        f=new JFrame();
//        Defining 2D Array
        String data[][]={
            {"Manish", "Bhaktapur", "manishshiwakoti42@gmail.com"},
            {"Ritika", "Kathmandu", "khadkaritika@gmail.com"},
            {"Harish", "Lalitpur", "haru123@gmail.com"},
            {"Meghna", "Sunsari", "meghna39@gmail.com"},
            {"Renuka", "Chitwan", "renurai@gmail.com"}
        };
//        Field names in Table
        String column[]={"Name", "Address", "Email"};
        
//        Creating Table in Java
        JTable jt =new JTable(data,column);
        
//        Setting Boundaries of Table
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp=new JScrollPane(jt);
        
        f.setSize(300, 400);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new JavaTable();
    }
}