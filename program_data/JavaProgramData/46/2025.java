package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int a;
		int c;
		int b;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (m > n)
		{
			b = n;
		}
		else
		{
			b = m;
		}
		if (b % 2 == 1)
		{
			c = (b + 1) / 2;
		}
		else
		{
			c = b / 2;
		}
		for (a = 0;a < c;a++)
		{
			if (a < m - a)
			{
				for (j = a;j < m - a;j++)
				{
					System.out.printf("%d\n",sz[a][j]);
				}
				if (1 + a < n - a)
				{
					for (i = 1 + a;i < n - a;i++)
					{
						 System.out.printf("%d\n",sz[i][m - a - 1]);
					}
					if (m - a - 2 >= a)
					{
						for (j = m - a - 2;j >= a;j--)
						{
							System.out.printf("%d\n",sz[n - a - 1][j]);
						}
						if (n - a - 2 > a)
						{
							 for (i = n - a - 2;i > a;i--)
							 {
								 System.out.printf("%d\n",sz[i][a]);
							 }
						}
					}
				}
			}
		}
		return 0;
	}

}

