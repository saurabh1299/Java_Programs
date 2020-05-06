import java.util.Scanner;

//main class.
class Array_sum
{
	//main function.
    public static void main(String args[]) 
    {
		//declaration part and assigning values.
        int number, sum=0;
        
		//it takes the count of elements you want in array.
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter no. of elements you want in array:");        
		number=sc.nextInt();
           
		//it takes the input of total elements you have entered in array.
        int a[]=new int[number];
        System.out.println("Enter all the elements:");

		//logic of the code.
        for(int i=0; i < number; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
		
		//print the output sum of all the array elements.
        System.out.println("sum:"+sum);
    }
}