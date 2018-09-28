package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int echo;
		int i;
		for (i = 2;i <= x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == x)
		{
			echo = 1;
		}
		else
		{
			echo = 0;
		}
		return echo;
	}
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= m / 2;i++)
		{
			if (prime(i) != 0 && prime(m - i) != 0)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
		return 0;
	}
}

