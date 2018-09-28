package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (m / 2);i += 2)
		{
			c = 1;
			for (j = 3;j < i;j++)
			{
				if (i % j == 0)
				{
					c = 0;
				break;
				}
			}
			if (c == 0)
			{
				continue;
			}
			for (k = 3;k < m - i;k++)
			{
				if ((m - i) % k == 0)
				{
					c = 0;
				break;
				}
			}
			if (c == 0)
			{
				continue;
			}

			System.out.printf("%d %d\n",i,m - i);
		}
		return 0;
	}




}

