package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(n));
		}


	}
	public static int reverse(int num)
	{
		int rev = 0;
		if (num >= 0)
		{
			while (num != 0)
			{
				rev = rev * 10 + num % 10;
				num = num / 10;
			}
		}
		else
		{
			int fan = -num;
			while (fan != 0)
			{
				rev = rev * 10 + fan % 10;
				fan = fan / 10;
			}
			rev = -rev;
		}
		return rev;
	}

}

