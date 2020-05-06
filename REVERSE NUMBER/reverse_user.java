import java.util.Scanner;

class user
 {
	 public static void main(String args[])
	 {
		 
    int n, rev = 0, remainder;
    
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter the number");
	n=sc.nextInt();

	
    while (n != 0) {
        remainder = n % 10;
        rev = rev * 10 + remainder;
        n /= 10;
    }
   System.out.println("Reversed number = "+rev);
}
 }

