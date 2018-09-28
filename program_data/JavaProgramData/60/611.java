package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
		else
		{
		for (i = 3;i <= n - 2;i++)
		{
			m = (int)Math.sqrt(i) + 1;
			for (k = 2;k <= m;k++)
			{
				if (i % k == 0)
				{
				break;
				}
			}
			if (k == m + 1)
			{
				p = (int)Math.sqrt(i + 2) + 1;
				for (t = 2;t <= p;t++)
				{
					if ((i + 2) % t == 0)
					{
					break;
					}
				}
				if (t == p + 1)
				{
				System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		}
	}
}

