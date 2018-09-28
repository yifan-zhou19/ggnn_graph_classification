package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int p;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			for (j = 3;(double)j <= Math.sqrt((double)i);j += 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if ((double)j > Math.sqrt((double)i))
			{
				m = n - i;
				for (p = 3;(double)p < Math.sqrt((double)m);p += 2)
				{
					if (m % p == 0)
					{
						break;
					}
				}
				if ((double)p > Math.sqrt((double)m))
				{
					System.out.printf("%d %d\n",i,m);
				}
			}
		}
		return 0;
	}
}

