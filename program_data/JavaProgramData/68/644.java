package <missing>;

public class GlobalMembers
{
	public static int panduan(int n)
	{
		int i;
		if (n == 1)
		{
			return 0;
		}
		else
		{
			for (i = 2;i <= Math.sqrt(n);i++)
			{
				if (n % i == 0)
				{
					break;
				}
			}
			if (i <= Math.sqrt(n))
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
	public static void Main()
	{
		int n;
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (x = 3;x <= n / 2;x = x + 2)
			{
				if (panduan(x) != 0)
				{
					if (panduan(i - x) != 0)
					{
						System.out.printf("%d=%d+%d\n",i,x,i - x);
						break;
					}
				}
			}

		}
	}
}

