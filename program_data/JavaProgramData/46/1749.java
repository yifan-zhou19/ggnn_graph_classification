package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int r;
		int c;
		int k;
		int[][] sz = new int[100][100];
		int time = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0, j = 0, m = r - 1, n = c - 1;i <= m != 0 && j <= n;i++, j++, m--, n--)
		{
			for (k = j;k <= n;k++)
			{
				System.out.printf("%d\n",sz[i][k]);
				time += 1;

			}

			if (time == r * c)
			{
				break;
			}

			for (k = i + 1;k <= m;k++)
			{
				System.out.printf("%d\n",sz[k][n]);
				time += 1;
			}
			if (time == r * c)
			{
				break;
			}

			for (k = n - 1;k >= j;k--)
			{
				System.out.printf("%d\n",sz[m][k]);
				time += 1;
			}
			if (time == r * c)
			{
				break;
			}

			for (k = m - 1;k >= i + 1;k--)
			{
				System.out.printf("%d\n",sz[k][j]);
				time += 1;

			}
			if (time == r * c)
			{
				break;
			}

		}





		return 0;
	}
}

