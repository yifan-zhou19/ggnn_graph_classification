package <missing>;

public class GlobalMembers
{
	public static void check(int m, int n, int[][] h)
	{
		int i;
		int j;
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				int x = 1;
				if (i != 0 && h[i][j] < h[i - 1][j])
				{
					x = 0;
				}
				if (i != m - 1 && h[i][j] < h[i + 1][j])
				{
					x = 0;
				}
				if (j != 0 && h[i][j] < h[i][j - 1])
				{
					x = 0;
				}
				if (j != n - 1 && h[i][j] < h[i][j + 1])
				{
					x = 0;
				}

				if (x == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] h = new int[20][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		check(m, n, h);
	}
}

