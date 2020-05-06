class duplicate_num
{
public static void main(String args[])
{
int number;	

Scanner input=new Scanner(System.in);
number=input.nextInt();

int a[]={1,2,3,2,1,6,7,8,8,7};
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
System.out.println(a[i]+" ");
	}
      }
    }
  }
}