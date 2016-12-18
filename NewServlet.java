import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet 
{
    @Override 
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
           {
               PrintWriter out = res.getWriter();
               res.setContentType("text/html");
               try
               {
               
               String AadNum = req.getParameter("Aadnum");
               if((AadNum==null) || (AadNum.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("Adhaar Card Number is "+AadNum);
               out.println("<br>");
               String UserName = req.getParameter("username");
               if((UserName==null) || (UserName.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("User name is"+UserName);
               out.println("<br>");
               String Gender = req.getParameter("gender");
               if((Gender==null) || (Gender.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("Gender is " +Gender);
               out.println("<br>");
               String Dob = req.getParameter("dob");
               out.println("Date of Birth "  +Dob);
               out.println("<br>");
               String UserAge = req.getParameter("userage");
               if((UserAge==null) || (UserAge.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("Age is " +UserAge);
               out.println("<br>");
               String UserAdd= req.getParameter("useradd");
               if((UserAdd==null) || (UserAdd.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("Address is "+UserAdd);
               out.println("<br>");
               String Country = req.getParameter("country");
               if((Country==null) || (Country.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("Country " +Country);
               out.println("<br>");
               String City = req.getParameter("city");
               if((City==null) || (City.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("City " +City);
               out.println("<br>");
               String PinNum = req.getParameter("pinnum");
               if((PinNum==null) || (PinNum.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               
               out.println("Pincode: "+PinNum);
               out.println("<br>");
               String PhNum = req.getParameter("phno");
               if((PhNum==null) || (PhNum.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
               out.println("Phone Number: "+PhNum);
               out.println("<br>");
               String Educ= req.getParameter("educ");
               String Educ1= req.getParameter("educ1");
               String Educ2= req.getParameter("educ2");
               String Educ3=req.getParameter("educ3");
               String Educ4= req.getParameter("educ4");
               out.println("Eduction: " +Educ);
               out.println(Educ1);
               out.println(Educ2);
               out.println(Educ3);
               out.println(Educ4);
               out.println("<br>");
               String Mtlstatus = req.getParameter("Mstatus");
               out.println("Martial Status: " +Mtlstatus);
               out.println("<br>");
               String Wrkstatus= req.getParameter("Wstatus");
               out.println("Working Status: " +Wrkstatus);
               out.println("<br>");
               int Salary= Integer.parseInt( req.getParameter("sal"));
               if(Salary < 0)
               {
                   out.println("Salary should not to be negative");
               } 
               out.println("Salary: " +Salary);
               out.println("<br>");
               String Depen= req.getParameter("dep");
                if((Depen==null) || (Depen.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
                             
               out.println("Dependent Status: "+Depen);
               out.println("<br/>");
               
               FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\Aad.txt",true);
	       BufferedWriter bw=new BufferedWriter(fw);
	 
               bw.write("Adhaar Card Number is "+AadNum);
               bw.newLine();
               bw.write("User name is"+UserName);
               bw.newLine();
               bw.write("Gender :" +Gender);
               bw.newLine();
               bw.write("Date of Birth "  +Dob);
               bw.newLine();
               bw.write("Age :" +UserAge);
               bw.newLine();
               bw.write("Address is "+UserAdd);
               bw.newLine();
               bw.write("Country " +Country);
               bw.newLine();
               bw.write("City " +City);
               bw.newLine();
               bw.write("Pincode: "+PinNum);
               bw.newLine();
               bw.write("Phone Number: "+PhNum);
               bw.newLine();
               bw.write("Eduction: " +Educ);
               bw.newLine();
               bw.write("Eduction: " +Educ1);
               bw.newLine();
               bw.write("Eduction: " +Educ2);
               bw.newLine();
               bw.write("Eduction: " +Educ3);
               bw.newLine();
               bw.write("Eduction: " +Educ4);
               bw.newLine();
               bw.write("Martial Status: " +Mtlstatus);
               bw.newLine();
               bw.write("Working Status: " +Wrkstatus);
               bw.newLine();
               bw.write("Salary: " +Salary);
               bw.newLine();
               bw.write("Dependent Status: " +Depen);
               bw.newLine();
               bw.newLine();
               bw.close();
             }
            catch (Exception ex)
        { 
            System.out.println(ex);
        }   
         
          
	}
		
        }