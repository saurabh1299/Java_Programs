public class reverse_num
{
    public static void main(String[] args) {

        int num = 12345, reverse=0;
		int result;

        while(num > 0)
		{
            result = num % 10;
            reverse = reverse * 10 + result;
            num=num/10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}