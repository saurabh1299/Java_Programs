import java.util.Scanner;
class mumbai
{
public static int count(String s,char c)
{

int res=0;
int i;

for(i=0; i < s.length(); i++)
{
	if(s.charAt(i)==c)
	
		res++;
	
}
return res;
}

public static void main(String args[])
{
String str;
char c;

Scanner sc=new Scanner(System.in);
System.out.println("\n Enter the String");
str=sc.next();	
	
Scanner input=new Scanner(System.in);
System.out.println("\n Enter the character");
c=input.next().charAt(0);

System.out.println(count(str,c));
}
}