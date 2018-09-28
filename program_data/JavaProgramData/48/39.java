package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int r;
		int k;
		int h;
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
		int[][] a = new int[11][11];
		a[5][5] = m;
		for (h = 0;h < n;h++)
		{
			int[][] b = new int[11][11];
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				if (a[i][j] != 0)
				{
					for (r = i - 1;r <= i + 1;r++)
					{
						for (k = j - 1;k <= j + 1;k++)
						{
							b[r][k] += a[i][j];
						}
					}
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				a[i][j] += b[i][j];
			}
		}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				if (j != 9)
				{
					System.out.printf("%d ",a[i][j]);
				}
				else
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
	}
}

