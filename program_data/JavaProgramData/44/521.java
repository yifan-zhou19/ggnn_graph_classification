package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int reverse = int num; //????
		for (int i = 0;i < 6;i++)
		{
		   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(reverse(a));
		   System.out.print("\n");
		}
		System.in.read();
		return 0;
	}
	public static int reverse(int num) //????????
	{
		int b = 0;
		if (num < 0)
		{
		   num *= -1; //????????
		   while (num > 0)
		   {
			   b = 10 * b + num % 10;
			   num /= 10;
		   }
		   b *= -1;
		}
		else if (num > 0)
		{
		   while (num > 0)
		   {
			   b = 10 * b + num % 10;
			   num /= 10;
		   }
		}
		return b;
	}

}

