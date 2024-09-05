package learning;
import java.util.*;
/**
 *  WAP to take input from the user (balance amount and withdraw amount). Show the remaining balance if 
 * withdraw amount is lesser than balance amount, otherwise handle the exception by creating exception class "MyException"
 */
public class MidTermTest {
    public static void main(String[] args) {
        try
        {
            System.out.println("Enter Balance Amount: ");
            Scanner s1=new Scanner(System.in);
            double balance=Double.parseDouble(s1.nextLine());
            
            System.out.println("Enter Withdraw Amount: ");
            Scanner s2=new Scanner(System.in);
            double withdraw=Double.parseDouble(s2.nextLine());
            
            if(withdraw>balance)
            {
                throw new MyException("Withdraw Amount is greater than Balance Amount");
            }
            else
            {
                System.out.println("Remaining Balance= Rs"+(balance-withdraw));
            }
        } 
        catch (MyException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
