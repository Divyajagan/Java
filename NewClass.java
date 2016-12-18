/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class NewClass {
    public static void main(String qwe[]) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\divya.txt");
        BufferedReader br = new BufferedReader(fr);
        String allLines, first;
        int countPass=0, countFail = 0;
        int countTokenizer = 0;
        while((allLines = br.readLine())!=null)
        {
            StringTokenizer str = new StringTokenizer(allLines);
            while(str.hasMoreTokens())
            {
                first = str.nextToken();
                countTokenizer++;
                
                if(first.contains("Category:Pass"))
                {
                    countPass++;
                }
                if(first.contains("Category:Fail"))
                {
                    countFail++;
                }
            }
        }
        System.out.println("Pass count is" +countPass);
        System.out.println("Fail count is" +countFail);
        
    }
}
