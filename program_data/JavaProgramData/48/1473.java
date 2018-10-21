package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int[][] t = new int[9][9];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[4][4] = 1;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				for (k = 0;k <= 8;k++)
				{
					t[j][k] = a[j][k];
				}
			}
			for (j = 5 - i;j <= 3 + i;j++)
			{
				for (k = 5 - i;k <= 3 + i;k++)
				{
					a[j][k] = a[j][k] + t[j][k];
				}
			}
			for (j = 5 - i;j <= 3 + i;j++)
			{
				for (k = 5 - i;k <= 3 + i;k++)
				{
					a[j - 1][k - 1] += t[j][k];
					a[j - 1][k] += t[j][k];
					a[j - 1][k + 1] += t[j][k];
					a[j][k - 1] += t[j][k];
					a[j][k + 1] += t[j][k];
					a[j + 1][k - 1] += t[j][k];
					a[j + 1][k] += t[j][k];
					a[j + 1][k + 1] += t[j][k];
				}
			}
		}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",m * a[i][j]);
				}
				else
				{
					System.out.printf(" %d",m * a[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

