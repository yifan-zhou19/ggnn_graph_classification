package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i += 2)
		{
			for (j = 3;j * j <= i;j += 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j * j <= i)
			{
				continue;
			}
			n = m - i;
			for (j = 3;j * j <= n;j += 2)
			{
				if (n % j == 0)
				{
					break;
				}
			}
			if (j * j > n)
			{
				System.out.printf("%d %d\n",i,m - i);
			}

		}

		return 0;
	}


}

