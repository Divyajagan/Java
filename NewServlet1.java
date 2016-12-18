import java.io.BufferedReader;
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
import java.util.StringTokenizer;

@WebServlet(urlPatterns = {"/StudentDemoServletFile"})
public class NewServlet1 extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        PrintWriter out=res.getWriter();        
	res.setContentType("text/html");
       try
       {
         String StudId=req.getParameter("studid");
         {
             if(StudId.charAt(0)!='s' || StudId.length()!=4)
	     
         {
             out.println("Invalid Student Id"); 
          } 
          else 
          {
              out.println("Student Id is" +StudId);
          }
         }
         out.println("<br>");
         String StudName=req.getParameter("studname");
         {
            if(StudName.length()>30)
            out.println("Name should not exist 30 character");
        }
         out.println("Student Name is" +StudName);
         out.println("<br>");
         int StudAge=Integer.parseInt(req.getParameter("studage"));
         {
         if(StudAge<25)
	
	 out.println("Age is not valid");
         else
         out.println("Student Age is" +StudAge);
        }
         out.println("<br/>");
         int StudMark=Integer.parseInt(req.getParameter("studmark"));
         int StudPercen=Integer.parseInt(req.getParameter("studpercen")); 
         out.println("Student Percentage " +StudPercen);
         out.println("<br>");
         String Ctgry=req.getParameter("ctgry");
         String StudGrade=req.getParameter("studgrade");
         
         if(StudMark < 0)
	{
		System.out.println("Mark should not be negative");
        }
         out.println("Student Mark is" +StudMark);
         out.println("<br>");
         {
            if(StudMark<=100 && StudMark>=85)
            {    
               out.println("Grade is " +StudGrade);
            }
            else if(StudMark<=84 &&  StudMark>=75)
            {
                out.println("Grade is " +StudGrade);
            }
            else if(StudMark<=74 && StudMark>=65)
            {
                 out.println("Grade is " +StudGrade);
            }
            else if(StudMark<=64 && StudMark>=55)
            {
                 out.println("Grade is" +StudGrade);
            }
            else if(StudMark<=54 && StudMark>=45)
            {
                 out.println("Grade is" +StudGrade);
            }
          } 
         if(StudMark<45)
         {
                  out.println("Grade is" +StudGrade);
                  
         }
         out.println("<br/>");
         out.println("Student Category " +Ctgry);
         out.println("<br/>");              

         FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\divya.txt",true);
	 BufferedWriter bw=new BufferedWriter(fw); 
	 bw.write("Student id:" +StudId);
	 bw.newLine();
	 bw.write("Student name:" +StudName);
	 bw.newLine();
	 bw.write("Student Age:" +StudAge);
	 bw.newLine();
	 bw.write("Student Mark:" +StudMark);
	 bw.newLine();
	 bw.write("Student Percentage: " +StudPercen);
	 bw.newLine();
         bw.write("Grade :" +StudGrade);
         bw.newLine();
         bw.write("Category:" +Ctgry);
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