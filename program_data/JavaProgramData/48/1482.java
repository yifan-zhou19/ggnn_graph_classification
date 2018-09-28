package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int d;
		int m;
		int n;
		int[][][] a = new int[20][20][20];
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
		a[1][5][5] = m;
		for (d = 1;d <= n;d++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (a[d][i][j] != 0)
					{
						a[d + 1][i - 1][j - 1] = a[d + 1][i - 1][j - 1] + a[d][i][j];
						a[d + 1][i - 1][j] = a[d + 1][i - 1][j] + a[d][i][j];
						a[d + 1][i - 1][j + 1] = a[d + 1][i - 1][j + 1] + a[d][i][j];
						a[d + 1][i][j - 1] = a[d + 1][i][j - 1] + a[d][i][j];
						a[d + 1][i][j + 1] = a[d + 1][i][j + 1] + a[d][i][j];
						a[d + 1][i + 1][j - 1] = a[d + 1][i + 1][j - 1] + a[d][i][j];
						a[d + 1][i + 1][j] = a[d + 1][i + 1][j] + a[d][i][j];
						a[d + 1][i + 1][j + 1] = a[d + 1][i + 1][j + 1] + a[d][i][j];
						a[d + 1][i][j] = a[d + 1][i][j] + a[d][i][j] * 2;
					}
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			System.out.printf("%d %d %d %d %d %d %d %d %d\n",a[n + 1][i][1],a[n + 1][i][2],a[n + 1][i][3],a[n + 1][i][4],a[n + 1][i][5],a[n + 1][i][6],a[n + 1][i][7],a[n + 1][i][8],a[n + 1][i][9]);
		}
		return 0;

	}
}

