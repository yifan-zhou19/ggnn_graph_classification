package <missing>;

public class GlobalMembers
{
	public static int shisushu(int n)
	{
		int i;
		int result = 1;
		for (i = 2;i <= n / 2;i++)
		{
			if (n % i == 0)
			{
				result = 0;
				break;
			}
		}
		return result;
	}
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 2;n <= m / 2;n++)
		{
			if (shisushu(n) == 1)
			{
				if (shisushu(m - n) == 1)
				{
					System.out.printf("%d %d\n",n,m - n);
				}
			}
		}
		return 0;
	}
}

