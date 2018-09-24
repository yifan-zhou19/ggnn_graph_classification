package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		System.out.print(num % 10);
		if (num / 10 != 0)
		{
			reverse(num / 10);
		}
		else
		{
			System.out.print("\n");
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		   if (n < 0)
		   {
			   System.out.print("-");
			   n = -n;
		   }
		   while (n % 10 == 0 && n != 0)
		   {
			 n = n / 10;
		   }
		   reverse(n);
		}

		return 0;
	}
}

