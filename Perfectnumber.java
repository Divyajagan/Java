import java.util.*;
public class Perfectnumber
{
public static void main(String args[])
{

        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number :  ");
        long y=x.nextInt(),i;
        
        for( i=2;i<y;i++){
            long z=y%i;
            if(z!=i)continue;
                System.out.print("prime" +z);

        }System.out.println(y);
    }
}

