package <missing>;

public class GlobalMembers
{
	public static int su(int i)
	{
		int j;
		if (i == 2)
		{
			return 0;
		}
		else if (i % 2 == 0)
		{
			return 1;
		}
		else
		{
			for (j = 3;j < Math.sqrt(i) + 1;j = j + 2)
			{
				if (i % j == 0)
				{
					return 1;
				}
			}
					   return 0;
		}
	}
	public static int Main()
	{
		int su = int i;
		int m;
		int t;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 6;n < m + 1;n = n + 2)
		{
		for (t = 2;t < n / 2 + 1;t++)
		{
			if (su(t) != 1)
			{
				if (su(n - t) != 1)
				{
				System.out.printf("%d=%d+%d\n",n,t,n - t);
				break;
				}
			}
		}
		}
		return 0;
	}
}

