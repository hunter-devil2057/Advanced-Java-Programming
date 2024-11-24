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
//            Inserting the data
            st.executeUpdate("INSERT INTO student(name, email) VALUES ('ram', 'ram@gmail.com')");
            //delete
           st.executeUpdate("DELETE FROM student WHERE id=3");
           //updating
           st.executeUpdate("UPDATE student SET name='manish', email='manish@gmail.com' WHERE id=4");
            //Selecting
            ResultSet rs=st.executeQuery("SELECT * FROM student");
            while(rs.next())
            {
                System.out.println(rs.getString("name")+rs.getString("email"));
            }
            conn.commit();
        }
        catch(SQLException ex)
        {
            conn.rollback();
        }
    }
    
}
