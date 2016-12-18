/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aadhar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class Aadhar {

        public static void main(String qwe[]) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\DIVYA JAVA\\Aad.txt");
        BufferedReader br = new BufferedReader(fr);
        String allLines,a;
        int countCitizen=0, countMale= 0,countFemale=0,countWrk=0,countMarried=0,countSal=0,countSenior=0;
        int countTokenizer = 0,countDepen=0,countGraduate=0;
        while((allLines = br.readLine())!=null)
        {
            StringTokenizer st = new StringTokenizer(allLines);
            while(st.hasMoreTokens())
            {
                a = st.nextToken();
                countTokenizer++;
                
                if(a.contains("Gender :Male"))
                {
                    countMale++;
                }
                if(a.contains("Gender :Female"))
                {
                    countFemale++;
                }
                countCitizen = countMale + countFemale;
                if(a.contains("Working Status: No"))
                {
                    countWrk++;
                }
                if(a.contains("Martial Status: yes"))
                {
                    countMarried++;
                }
                if(a.contains("Education:PhD")||a.contains("Education:PG")||a.contains("Education:UG"))
                {
                    countGraduate++;
                }
                if(a.contains("Age: "))
                {
                    String age = a.substring(2);
                    int senior = Integer.parseInt(age);
                    if(senior>60)
                    {
                          countSenior++;
                    }
                 }
                if(a.contains("Salary: "))
                {
                    String sal = a.substring(7);
                    int sal1 = Integer.parseInt(sal);
                    if(sal1>10000)
                    {
                          countSal++;
                    }
                 }
                 if(a.contains("Dependent: "))
                 {
                     String depen = a.substring(10);
                     int depent = Integer.parseInt(depen);
                     if(depent>4)
                     {
                          countDepen++;
                     } 
                 }
            }
        }
        
        System.out.println(" Total male eligible for voting :" +countMale);
        System.out.println(" Total graduate citizens :" +countGraduate);
        System.out.println(" Total citizens who are married :" +countMarried);
        System.out.println(" Total Citizen who are not working :" +countWrk);
        System.out.println(" Total Citizen Eligible for Voting :" +countCitizen);
        System.out.println(" Total Female eligible for voting :" +countFemale);
        System.out.println(" Total citizens whose salary is above 10000: " +countSal);
        System.out.println(" Total citizen who eligible for pension and coming under Senior Citizen category :" +countSenior);
        System.out.println(" Total citizen whose dependents are more than 4 :" +countDepen);
                           
        }
}


