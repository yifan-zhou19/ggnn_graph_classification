package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 3;
		int i1 = 2;
		int i2 = 2;
		int x;
		int y;
		double k;
		double l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (;i <= m / 2;i = i + 2)
		{
			k = sqrtf(i);
			for (i1 = 2;i1 <= k;i1++)
			{
				if (i % i1 == 0)
				{
					x = i1;
					break;
				}
			}
			if (i % x == 0)
			{
				continue;
			}
			l = sqrtf(m - i);
			for (i2 = 2;i2 <= l;i2++)
			{
				if ((m - i) % i2 == 0)
				{
					y = i2;
					break;
				}
			}
			if ((m - i) % y == 0)
			{
				continue;
			}
			System.out.printf("%d %d\n",i,m - i);
		}
	}
}

