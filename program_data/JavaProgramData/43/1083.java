package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int x;
		int p = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m == 6)
		{
			System.out.print("3 3");
		}
		else
		{
		for (i = 3;i <= m / 2;i += 2)
		{
			k = m - i;
			for (x = 2;x <= Math.sqrt(i);x++)
			{
				if ((i % x) == 0)
				{
					p = 1;
				}
			}
			for (x = 2;x <= Math.sqrt(k);x++)
			{
				if ((k % x) == 0)
				{
					q = 1;
				}
			}
			if (p == 0 && q == 0)
			{
				System.out.printf("%d %d\n",i,k);
			}
				p = 0;
				q = 0;
		}
		}
		return 0;
	}
}

