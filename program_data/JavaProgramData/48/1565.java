package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[5][11][11];
		int i;
		int j;
		int k;
		int m;
		int n;
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
		a[0][5][5] = m;
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < 10;j++)
			{
				for (k = 1;k < 10;k++)
				{
					a[i + 1][j][k] = 2 * a[i][j][k] + a[i][j][k - 1] + a[i][j][k + 1] + a[i][j - 1][k - 1] + a[i][j - 1][k] + a[i][j - 1][k + 1] + a[i][j + 1][k - 1] + a[i][j + 1][k] + a[i][j + 1][k + 1];
				}
			}
		}
		for (j = 1;j < 10;j++)
		{
				for (k = 1;k < 10;k++)
				{
					if (k == 9)
					{
					System.out.printf("%d\n",a[i][j][k]);
					}
					else
					{
					System.out.printf("%d ",a[i][j][k]);
					}

				}
		}

	}

}

