package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int num;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			day = Integer.parseInt(tempVar2);
		}
		int[][][] a = new int[day + 1][10][10];
		for (i = 0;i <= day;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					a[i][j][k] = 0;
				}
			}
		}
		a[0][5][5] = num;
		for (i = 1;i <= day;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					if (a[i - 1][j][k] != 0)
					{
						a[i][j - 1][k - 1] += a[i - 1][j][k];
						a[i][j - 1][k] += a[i - 1][j][k];
						a[i][j - 1][k + 1] += a[i - 1][j][k];
						a[i][j][k - 1] += a[i - 1][j][k];
						a[i][j][k + 1] += a[i - 1][j][k];
						a[i][j][k] += 2 * a[i - 1][j][k];
						a[i][j + 1][k - 1] += a[i - 1][j][k];
						a[i][j + 1][k] += a[i - 1][j][k];
						a[i][j + 1][k + 1] += a[i - 1][j][k];
					}
				}
			}
		}
		for (j = 1;j <= 9;j++)
		{
			for (k = 1;k <= 8;k++)
			{
				System.out.printf("%d ",a[day][j][k]);
			}
			System.out.printf("%d\n",a[day][j][9]);
		}
		return 0;
	}
}

