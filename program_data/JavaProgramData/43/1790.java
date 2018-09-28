package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a = 0;
		int b;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i < m;i++)
		{
			for (j = 2;j <= Math.sqrt((double)i);j++)
			{
				a = a + (i % j == 0);
			}
			if (a == 0)
			{
				b = m - i;
				if (b >= i)
				{
				for (j = 2;j <= Math.sqrt((double)b);j++)
				{
					c = c + (b % j == 0);
				}
				if (c == 0)
				{
					System.out.printf("%d %d\n",i,b);
				}
				c = 0;
				}
			}
			a = 0;
		}
	}
}

