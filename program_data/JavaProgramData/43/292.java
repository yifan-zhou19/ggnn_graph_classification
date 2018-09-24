package <missing>;

public class GlobalMembers
{
	public static int su(int x)
	{
		int j;
		for (j = 2;j <= x / 2;j++)
		{
			if (x % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			if (su(i) == 1 && su(m - i) == 1)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
		return 0;
	}
}

