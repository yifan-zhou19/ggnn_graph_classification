package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[5][11][11];
		int m;
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
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
		a[0][5][5] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
			for (p = i - 1;p <= i + 1;p++)
			{
				for (q = j - 1;q <= j + 1;q++)
				{
					a[k][i][j] += a[k - 1][p][q];
				}
			}
				a[k][i][j] += a[k - 1][i][j];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
						 for (j = 1;j <= 8;j++)
						 {
							 System.out.printf("%d ", a[n][i][j]);
						 }
						 System.out.printf("%d\n", a[n][i][9]);
		}
		return 0;
	}

}

