package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[5][11][11];
		int day;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][5][5] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			day = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= day;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					a[i][j][k] = a[i - 1][j][k] * 2 + a[i - 1][j - 1][k - 1] + a[i - 1][j - 1][k] + a[i - 1][j - 1][k + 1] + a[i - 1][j][k - 1] + a[i - 1][j][k + 1] + a[i - 1][j + 1][k - 1] + a[i - 1][j + 1][k] + a[i - 1][j + 1][k + 1];
				}


			}
		}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k < 9;k++)
				{
					System.out.printf("%d ",a[i - 1][j][k]);
				}
				System.out.printf("%d\n",a[i - 1][j][9]);
			}
		return 0;
	}


}

