import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/customerdetails"})
public class customerdetails extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        PrintWriter out=res.getWriter();        
	res.setContentType("text/html");
       
         try{
                 String CusId=req.getParameter("cusid");
                    if(CusId.charAt(0)!='c' || CusId.length()!=4)
	            {
                        out.println("Invalid Student Id"); 
                    } 
                    else 
                    {
                         out.println("Student Id is" +CusId);
                    }
                 String Cusname=req.getParameter("cusname");
                 if((Cusname==null) || (Cusname.isEmpty()))
                {
                   out.println("Please Go back and Enter the data");
                }
                 String Gender=req.getParameter("gender");
                 String CusAge=req.getParameter("cusage");
                  if((CusAge==null) || (CusAge.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
                 String CusAdd=req.getParameter("cusadd");
                 if((CusAdd==null) || (CusAdd.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
                 String City=req.getParameter("city");
                 if((City==null) || (City.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
                 
                 String Country=req.getParameter("country");
                 if((Country==null) || (Country.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
                 int Pin=Integer.parseInt(req.getParameter("pin"));
                 String Phone=req.getParameter("phone");
                 if((Phone==null) || (Phone.isEmpty()))
               {
                   out.println("Please Go back and Enter the data");
               }
                 String AreaInt=req.getParameter("AOI");
                 String AreaInt1=req.getParameter("AOI1");
                 String AreaInt2=req.getParameter("AOI2");
                 String AreaInt3=req.getParameter("AOI3");
                 String AreaInt4=req.getParameter("AOI4");
                 String DOB=req.getParameter("dob");
                 
                 out.println("Customer ID is "  +CusId);
                 out.println("<br>");
                 out.println("Customer name is "  +Cusname);
                 out.println("<br>");
                 out.println("Customer Gender is "  +Gender);
                 out.println("<br>");
                 out.println("Customer Age is "  +CusAge);
                 out.println("<br>");
                 out.println("Customer Address is "  +CusAdd);
                 out.println("<br>");
                 out.println("Customer city is "  +City);
                 out.println("<br>");
                 out.println("Customer country is "  +Country);
                 out.println("<br>");
                 out.println("Customer Pin is "  +Pin);
                 out.println("<br>");
                 out.println("Customer Phone number is "  +Phone);
                 out.println("<br>");
                 out.println("Customer Area of Interest is "  +AreaInt+ " "+AreaInt1+ " "+AreaInt2+ " "+AreaInt3+ " " +AreaInt4);
                 out.println("<br>");
                 out.println("Date of Birth is "  +DOB);
                 out.println("<br>");
         
         
             
         FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\cus.txt",true);
	 BufferedWriter bw=new BufferedWriter(fw);
	 
                 bw.write("Customer ID is "  +CusId);
                 bw.newLine();
                 bw.write("Customer name is "  +Cusname);
                 bw.newLine();
                 bw.write("Customer Gender is "  +Gender);
                 bw.newLine();
                 bw.write("Customer Age is "  +CusAge);
                 bw.newLine();
                 bw.write("Customer Address is "  +CusAdd);
                 bw.newLine();
                 bw.write("Customer city is "  +City);
                 bw.newLine();
                 bw.write("Customer country is "  +Country);
                 bw.newLine();
                 bw.write("Customer Pin is "  +Pin);
                 bw.newLine();
                 bw.write("Customer Phone number is "  +Phone);
                 bw.newLine();
                 bw.write("Customer Area of Interest is "  +AreaInt);
                 bw.write("Customer Area of Interest is "  +AreaInt);
                 bw.write("Customer Area of Interest is "  +AreaInt);
                 bw.write("Customer Area of Interest is "  +AreaInt);
                 bw.write("Customer Area of Interest is "  +AreaInt);
                 bw.newLine();
                 bw.write("Date of Birth is "  +DOB);
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

