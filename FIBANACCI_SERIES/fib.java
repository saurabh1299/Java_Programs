import java.util.Scanner;

public class fib
{
	public static void main(String args[])
	{
int i,n1=1,n2=0,n3,temp;
int number;

Scanner sc =new Scanner(System.in);
System.out.println("\n Enter the number");
number=sc.nextInt();

for(i=0;i<=number;i++)
{
	n3=n1+n2;
	n1=n2;
	n2=n3;	

System.out.println(n1);
}
}
}
