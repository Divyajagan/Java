import java.util.Scanner;
public class binarynumber
{
        public static void main(String args[])
        {
              int r=0,c=0,num,b;
              Scanner sl=new Scanner(System.in);
              System.out.println("Enter a number");
              num=sl.nextInt();
              b= num;
              while(num>0)
                   {
                      if((num %10==0)|| (num%10==1))
                         r++;
                         c++;
                         num=num/10;
                   }
                      if(r==c)
               System.out.println(b+ " is True");
               else
               System.out.println(b+ " is False");
           }
}