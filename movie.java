import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/movie"})
public class movie extends HttpServlet 
{
    @Override 
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
           {
               PrintWriter out = res.getWriter();
               res.setContentType("text/html");
               try
               {
               
               String MovieId=req.getParameter("movieid");
               {
                    if(MovieId.length()>4)
                    {    
                            out.println("Movie Id is invalid");
                    }
                    else
                    { 
                            out.println("Movie Id    :" +MovieId);
                    }
               }
               out.println("<br>");
               String MovieName= req.getParameter("moviename");
               out.println("Movie Name  :" +MovieName);
                out.println("<br>");
               String ReleaseDate= req.getParameter("releasedate");
               int Rating= Integer.parseInt(req.getParameter("rating"));
               if(Rating>10)
               {
                   out.println("Should not exist 10 rating");
               }
               out.println("Rating      :" +Rating);
               out.println("<br>");
               String Duration= req.getParameter("dura");
               out.println("Movie Duration   :" +Duration);
               
               FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\movie.txt",true);
	       BufferedWriter bw=new BufferedWriter(fw);
	 
               bw.write("MovieId    :" +MovieId);
               bw.newLine();
               bw.write("MovieName  :" +MovieName);
               bw.newLine();
               bw.write("ReleaseDate :" +ReleaseDate);
               bw.newLine();
               bw.write("Rating :" +Rating);
               bw.newLine();
               bw.write("Movie Duration   :" +Duration);
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