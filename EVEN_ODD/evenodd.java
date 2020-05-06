import java.util.Scanner;

public class evenodd
{
public static void main(String args[])
{
int number;
System.out.println("enter a number");

Scanner input=new Scanner(System.in);
number=input.nextInt();

if(number % 2 == 0)
System.out.println("even number");
else
System.out.println("Odd number");
}
}