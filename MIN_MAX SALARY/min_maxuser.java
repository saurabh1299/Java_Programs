import java.util.Scanner;
class number
{
public static void main(String args[])
{
int min=0;
int max=0;
int num1;
int num2;

Scanner sc=new Scanner(System.in);
System.out.println("\n Enter first number");
num1=sc.nextInt();

Scanner input=new Scanner(System.in);
System.out.println("\n Enter second number");
num2=input.nextInt();

if(num1<num2)
{
min=num1;
System.out.println("\n min no"+min);
}
else
{
max=num2;
System.out.println("\n max is"+max);
}
}
}