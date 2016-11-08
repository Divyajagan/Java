    class thiscons{  
        int id;  
        String name;  
        thiscons(){System.out.println("default constructor is invoked");}  
          
        thiscons(int id,String name){  
        this();
	id = id;  
        name = name;  
          
        }  
        void display(){System.out.println(id+" "+name);}  
          
        public static void main(String args[]){  
        thiscons e1 = new thiscons(111,"karan");  
        thiscons e2 = new thiscons(222,"Aryan");  
        e1.display();  
        e2.display();  
       }  
    }  