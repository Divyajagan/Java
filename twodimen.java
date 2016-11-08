public class twodimen
{
public static void main (String[] args)
{
int[][] marks= new int[3][6];
for(int i=0;i<marks.length;i++)
{
for(int j=0;j<marks[i].length;j++)
{
marks[i][j]=(int)(Math.random()*100);
}
}
for(int i=0;i<marks.length;i++)
{
for(int j=0;j<marks[i].length;j++)
{
System.out.println("Marks is sub:" +marks[i][j]);
}
}
}
}
