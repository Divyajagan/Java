
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/user"})
public class user extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        PrintWriter out=res.getWriter();        
	res.setContentType("text/html");
       
         try{
                 String Username=req.getParameter("username");
                 String UserEmail=req.getParameter("useremail");
                 String UserAdd=req.getParameter("useradd");
                int Userdetails=Integer.parseInt(req.getParameter("userdetails"));
               int DOB=Integer.parseInt(req.getParameter("dob"));
               String Gender =req.getParameter("gender");
               String State=req.getParameter("state");
               String City=req.getParameter("city");
                String Country=req.getParameter("country");
              
               		
                out.println("User Name is" +Username);
		out.println("<br/>");
                out.println("User Email Id is" +UserEmail);
		out.println("<br/>");
                out.println("User Address is" +UserAdd);
		out.println("<br/>");
                out.println("User Details is" +Userdetails);
		out.println("<br/>");
                out.println("DOB is" +DOB);
		out.println("<br/>");
                out.println("Gender" +Gender);
		out.println("<br/>");
                out.println("State" +State);
		out.println("<br/>");
                out.println("City" +City);
		out.println("<br/>");
                out.println("Country" +Country);
		out.println("<br/>");
                
               
         FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\user.txt",true);
	 BufferedWriter bw=new BufferedWriter(fw);
	 
	 bw.write("User name is" +Username);
	 bw.newLine();
	 bw.write("User Email Id is" +UserEmail);
	 bw.newLine();
	 bw.write("User Address is" +UserAdd);
	 bw.newLine();
         bw.write("User contact details" +Userdetails);
	 bw.newLine();
	 bw.write("User Date of birth " +DOB);
	 bw.newLine();
	 bw.write("State is" +State);
	 bw.newLine();
          bw.write("City is " +City);
	 bw.newLine();
          bw.write("Country is " +Country);
	 bw.newLine();
          bw.write("Gender is " +Gender);
	 bw.newLine();
             bw.close();
       }
         catch (Exception ex)
        { 
            System.out.println(ex);
        }   
         
          
	}
		
        }