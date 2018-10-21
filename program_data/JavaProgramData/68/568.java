package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (p = 3;p <= (i / 2);p = p + 2)
			{
				q = i - p;
				for (j = 3;j < Math.sqrt(p);j++)
				{
					if (p % j == 0)
					{
						break;
					}
				}
				for (m = 3;m < Math.sqrt(q);m++)
				{
					if (q % m == 0)
					{
						break;
					}
				}
				if (j >= ((int)Math.sqrt(p) + 1) && m >= ((int)Math.sqrt(q) + 1))
				{
					System.out.printf("%ld=%ld+%ld\n",i,p,q);
					break;
				}
				else
				{
					continue;
				}
			}
		}
	return 0;
	}
}

