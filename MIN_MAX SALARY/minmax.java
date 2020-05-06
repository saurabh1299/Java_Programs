

class minmax
{
public static void main(String args[])
{
int a[]={100,125,64,78,98,68,79};
int min=a[0];
int max=a[0];
int number;

for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
System.out.println(max);
System.out.println(min);
}
}