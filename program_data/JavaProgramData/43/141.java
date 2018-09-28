package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (m / 2);i = i + 2)
		{
			for (c = 0,j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
				c = c + 1;
				}
			}
			if (c == (i - 2))
			{
				for (d = 0,j = 2;j < (m - i);j++)
				{
					if ((m - i) % j != 0)
					{
					d = d + 1;
					}
				}
				if (d == (m - i - 2))
				{
				System.out.printf("%d %d\n",i,m - i);
				}
			}
		}
	}
}

