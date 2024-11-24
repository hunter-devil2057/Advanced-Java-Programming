package chapter4;
import java.sql.*;
public class Chapter4 {
    static final String url="jdbc:mysql://localhost:3306/ajp_ncit";
//    static final String db="ajp_ncit";
    static final String user="root";
    static final String pass="";
//    static final String tbl="";
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        Statement st=null;
        try{
            conn=DriverManager.getConnection(url, user, pass);
            conn.setAutoCommit(false);
            if(conn!=null)
            {
                System.out.println("Connected Successfully...");
            }
            st=conn.createStatement();
            st.executeUpdate("insert into student(name, email) values ('ram', 'ram@gmail.com')");
            conn.commit();
        }
        catch(SQLException ex)
        {
            conn.rollback();
        }
    }
    
}
