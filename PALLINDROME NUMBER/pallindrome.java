import java.util.Scanner;

class pallindrome
{  
 public static void main(String args[])
{  
  int result,sum=0,temp;    
  int num;			//It is the number variable to be checked for palindrome  
  temp=sum;

  Scanner sc=new Scanner(System.in);
  System.out.println("\n Enter the number: ");
  num=sc.nextInt();
 
while(num > 0)
{    
 result=num%10;  //getting remainder  
 sum=(sum*10)+result;    
 num=num/10;    
}  
if(temp==sum)    

System.out.println("palindrome number ");    
else    
System.out.println("not palindrome");    
}  
}  