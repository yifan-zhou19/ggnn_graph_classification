package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[5][10][10];
		int k;
		int i;
		int j;
		int m;
		int n;
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
		for (i = 0;i <= 10;i++)
		{
				for (j = 0;j <= 10;j++)
				{
					a[0][i][j] = 0;
				}
		}
		a[0][5][5] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[k][i][j] = a[k - 1][i][j] * 2 + a[k - 1][i - 1][j - 1] + a[k - 1][i][j - 1] + a[k - 1][i - 1][j] + a[k - 1][i][j + 1] + a[k - 1][i + 1][j] + a[k - 1][i + 1][j + 1] + a[k - 1][i + 1][j - 1] + a[k - 1][i - 1][j + 1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if ((Math.abs(i - 5) > n) || (Math.abs(j - 5) > n))
				{
					a[k][i][j] = 0;
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j != 9)
				{
				   System.out.printf("%d ",a[n][i][j]);
				}
				else
				{
					System.out.printf("%d",a[n][i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

