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
	public static void main(String args[]) throws FileNotFoundException{
		Student sud=null;
		try{
				FileInputStream fis=new FileInputStream("D://ss.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				sud=(Student) ois.readObject();
				ois.close();
				fis.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
				
			}
		catch (ClassNotFoundException c) {
			// TODO Auto-generated catch block
			c.printStackTrace();
			return;
		}
	
		System.out.println(sud.sname);
		System.out.println(sud.sid);
		System.out.println(sud.sdepart);
		
	}

}
