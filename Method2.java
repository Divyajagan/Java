class Method2{  
  void sum(int a,int b){System.out.println(a+b);}  
  void sum(double a,double b){System.out.println(a+b);}  
  
  public static void main(String args[]){  
  Method2 obj=new Method2();  
  obj.sum(10.5,10.5);  
  obj.sum(20,20);  
  
  }  
}