class armstrong
{
	public static void main(String args[])
	{
		int num=153,sum=0,result,temp;
		//System.out.println("\n enter the no");
		
		
		//Scanner sc=new Scanner(System.in);
		//num=sc.nextInt();
		/////////////////////////
		temp=num;
		while(num>0)
		{
			result=num%10;
			sum=(sum)+(result*result*result);
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number is armstrong");
		}
		else
			System.out.println("Not armstrong number");
	}
}
		