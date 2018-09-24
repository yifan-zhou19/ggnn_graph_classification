package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a = 0;
		int b = 0;
		int c;
		int d = 0;
		int e = 0;
		int[][] sz = new int[100][100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		c = n * m;
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
		while (d < c)
		{
			for (b = b;b < m - e;b++)
			{
				System.out.printf("%d\n",sz[a][b]);
				d++;
			}
			if (d >= c)
			{
				break;
			}
			b = b - 1;
			for (a = a + 1;a < n - e;a++)
			{
				System.out.printf("%d\n",sz[a][b]);
				d++;
			}
			if (d >= c)
			{
				break;
			}
			a = a - 1;
			for (b = b - 1;b >= e;b--)
			{
				System.out.printf("%d\n",sz[a][b]);
				d++;
			}
			if (d >= c)
			{
				break;
			}
			b = b + 1;
			for (a = a - 1;a >= e+1;a--)
			{
				System.out.printf("%d\n",sz[a][b]);
				d++;
			}
			if (d >= c)
			{
				break;
			}
			a = a + 1;
			b = b + 1;
			e++;
		}

		return 0;
	}

}

