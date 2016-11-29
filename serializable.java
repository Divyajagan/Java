package serial;
import java.io.*;

public class ss {
	public static class Student implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String sname;
		int sid;
		String sdepart;
	
	}
	public static void main(String args[]) throws FileNotFoundException
	{
		Student s1=new Student();
		s1.sname="Priya";
		s1.sid=12;
		s1.sdepart="CSE";
		try{
				FileOutputStream fos=new FileOutputStream("D://ss.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject();
				oos.close();
				fos.close();
			
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
				
			}
			System.out.println("Hi");
		
	}

}
