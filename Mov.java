/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Mov 
{

     public static void main(String qwe[]) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\movie.txt");
        BufferedReader br = new BufferedReader(fr);
        String allLines, firstToken;
        int countRating=0, countDura = 0;
        int countTokenizer = 0;
        while((allLines = br.readLine())!=null)
        {
            StringTokenizer st = new StringTokenizer(allLines);
            while(st.hasMoreTokens())
            {
                firstToken = st.nextToken();
                countTokenizer++;
                System.out.println("\n"+countTokenizer+".\n");
                //System.out.println(firstToken);
                          
                if(firstToken.contains("Rating :4"))
                {
                    countRating++;
                }
                if(firstToken.contains("Movie Duration   :2:15"))
                {
                    countDura++;
                }
            }
        }
        System.out.println("total movies released between two specific dates" +countRating);
        System.out.println("number of movies having rating of 4" +countRating);
        System.out.println("number of movies having duration 2.5 hrs" +countRating);
        System.out.println("Display total number of movies data available" +countRating);
        
        
    }
}
