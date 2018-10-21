package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 void reverse(int num); //????
	 int num;
	 for (int i = 0;i < 6;i++) //????
	 {
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		reverse(num); //????
		System.out.print("\n");
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}
	public static void reverse(int num) //?????�?????????int reverse(int num)?�
	{
	 void fan(int num); //????
	 double flag = 1;
	 double weishu = 0;
	 double reverse = 0;
	 if (num < 0) //???????
	 {
		num = -num;
		System.out.print('-');
	 }
	 for (;;) //?????0
	 {
			if (num % 10 == 0)
			{
				num /= 10;
			}
			else
			{
				break;
			}
	 }
	 fan(num); //????????
	}
	public static void fan(int num)
	{
		System.out.print(num % 10);
		if (num / 10 != 0)
		{
			fan(num / 10); //????
		}
	}
}

