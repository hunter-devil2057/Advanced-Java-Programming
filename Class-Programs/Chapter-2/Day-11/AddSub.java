package ncitchapter2;
import java.awt.event.*;
import javax.swing.*;
public class AddSub implements ActionListener {
    JFrame f;
    JTextField t1;
    JTextField t2;
    JLabel Ans;
    JLabel Result;
    JButton b1;
    JButton b2;
//     Constructor
        AddSub()
          {
                  f=new JFrame("Add Sub Test");
//              First Text Field
                    t1=new JTextField();
                    t1.setBounds(20, 20, 100, 20);
                    f.add(t1);
//               Second Text Field
                    t2=new JTextField();
                    t2.setBounds(20, 50, 100, 20);
                    f.add(t2);
//                 Button for Add
                    b1=new JButton("Add");
                    b1.setBounds(40, 70, 60, 20);
                    f.add(b1);
                    b1.addActionListener(this);
//                 Button for Subtract
                    b2=new JButton("Subtract");
                    b2.setBounds(110, 70, 85, 20);
                    b2.addActionListener(this);
                    f.add(b2);
//                    New Result named Result
                    Result=new JLabel();
                    Result.setBounds(20, 120, 100, 20);
                    f.add(Result);
                    f.setSize(500, 500);
                    f.setLayout(null);
                    f.setVisible(true);
          }
        
     @Override
        public void actionPerformed(ActionEvent e)
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int add=num1+num2;
            int sub=num1-num2;
            if(e.getSource()==b1){
                Result.setText("Result: "+add);
            }
            else if(e.getSource()==b2){
                Result.setText("Result: "+sub);
            }
        }
    public static void main(String[] args)
    {
       new AddSub();
    }

}
