package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int p1 = 0;
		int p2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m > 5 && m % 2 == 0 && m < 10001)
		{
		for (i = 3;i <= m / 2;i = i + 2)
		{
			for (j = 3;j < i;j = j + 2)
			{
				if (i % j == 0 || (m - i) % j == 0)
				{
					p1 = 1;
					break;
				}
			}
			for (j = i;j < m - i;j = j + 2)
			{
				if ((m - i) % j == 0)
				{
					p2 = 1;
					break;
				}
			}
			if (p1 == 0 && p2 == 0)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
			p1 = 0;
			p2 = 0;
		}
		}
		return (0);
	}
}

