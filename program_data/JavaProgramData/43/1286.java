package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i = i + 2)
		{
			for (j = 1;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					k = k + 1;
				}
			}
			for (j = 1;j <= Math.sqrt(n - i);j++)
			{
				if ((n - i) % j == 0)
				{
					m = m + 1;
				}
			}
			if (m == 1 && k == 1)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
			m = 0;
			k = 0;
		}
		return 0;
	}
}

