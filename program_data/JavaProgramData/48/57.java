package <missing>;

public class GlobalMembers
{
	public static void xijun(int[][][] a, int x, int n)
	{
		int i;
		int j;
		int k;

		for (i = 1;i <= n;i++)
		{


			for (j = 1;j < 10;j++)
			{
				for (k = 1;k < 10;k++)
				{
					a[i][j][k] = 2 * (a[i - 1][j][k]) + a[i - 1][j - 1][k - 1] + a[i - 1][j - 1][k] + a[i - 1][j - 1][k + 1] + a[i - 1][j][k - 1] + a[i - 1][j][k + 1] + a[i - 1][j + 1][k - 1] + a[i - 1][j + 1][k] + a[i - 1][j + 1][k + 1];
				}
			}
		}
	}
	public static void Main()
	{
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
		int[][][] a = new int[5][11][11];
		a[0][5][5] = m;
		xijun(a, m, n);
		int i;
		int j;
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				if (j == 9)
				{
					System.out.printf("%d\n",a[n][i][j]);
					continue;
				}
				System.out.printf("%d ",a[n][i][j]);
			}
		}
	}
}

