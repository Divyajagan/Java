import java.util.Scanner;
 
 
public class vowelscount
 {
 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
 
 
        String word;
        System.out.print("Enter a String: ");
        word = input.nextLine();
        int count =0;
 
 
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
            {
                count++;
            }
            else if(word.charAt(i) == 'e' || word.charAt(i) == 'E')
            {
                count++;
            }
            else if(word.charAt(i) == 'i' || word.charAt(i) == 'I')
            {
                count++;
            }
            else if(word.charAt(i) == 'o' || word.charAt(i) == 'O')
            {
                count++;
            }
            else if(word.charAt(i) == 'u' || word.charAt(i) == 'U')
            {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
 
 
         
    }
 
}