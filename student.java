    class Student{  
     int rollno;  
     String name;  
      
     void insertRecord(int r, String n){  //method  
      rollno=r;  
      name=n;  
     } 
      
     void studentInfo(){System.out.println(rollno+" "+name);}//method  
      
     public static void main(String args[]){  
      Student s1=new Student();  
      Student s2=new Student();  
      
      s1.insertRecord(111,"Karan");  
      s2.insertRecord(222,"Aryan");  
      
      s1.studentInfo();  
      s2.studentInfo();  
      
     }  
    }  