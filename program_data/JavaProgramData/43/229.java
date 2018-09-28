package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (m / 2);i++)
		{
			k = 1;
			for (j = 2;j <= (i / 2);j++)
			{
				if (i % j == 0)
				{
					k = 0;
				}
			}
			if (k == 1)
			{
				n = m - i;
			}
			for (j = 2;j <= (n / 2);j++)
			{
				if (n % j == 0)
				{
					k = 0;
				}
			}
			if (k == 1)
			{
			System.out.printf("%d %d\n",i,n);
			}
		}
		return 0;
	}


}

