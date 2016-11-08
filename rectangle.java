class rectangle
{
int len;
int wid;
void area(int l,int w)
{
len=l;
wid=w;
}
void calArea()
{
System.out.println(len*wid);
}
public static void main(String args[]) 
{
rectangle obj1=new rectangle();
rectangle obj2=new rectangle();
obj1.area(12,13);
obj2.area(15,18);
obj1.calArea();
obj2.calArea();
}
}