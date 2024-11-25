import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculateServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            response.setContentType("text/html; charset=UTF-8");
            int num1=Integer.parseInt(request.getParameter("txtNum1"));
            int num2=Integer.parseInt(request.getParameter("txtNum2"));
            int sum=num1+num2;
            response.sendRedirect("Result.jsp?sum="+sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
