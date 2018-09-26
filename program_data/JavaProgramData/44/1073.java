package <missing>;

public class GlobalMembers
{
	public static int reverse(int b)
	{
		int a = 0;
		while (b > 0)
		{
			a = a * 10 + b % 10;
			b = b / 10;
		}
		return a;
	}
	public static int Main()
	{
		int x;
		int tag = 1;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			if (x < 0)
			{
				System.out.printf("%d\n",-reverse(-x));
			}
			else
			{
				System.out.printf("%d\n",reverse(x));
			}

		}
		return 0;
	}

}

