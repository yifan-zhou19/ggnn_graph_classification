package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
		a[4][4] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 5 - k;i <= 3 + k;i++)
			{
				for (j = 5 - k;j <= 3 + k;j++)
				{
					b[i][j] += 2 * a[i][j];
					b[i - 1][j - 1] += a[i][j];
					b[i - 1][j] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
				}
			}
			for (i = 0;i <= 8;i++)
			{
				for (j = 0;j <= 8;j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
		}
		for (i = 0;i <= 8;i++)
		{
				for (j = 0;j <= 8;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j < 8)
					{
						System.out.print(" ");
					}
				}
				if (i < 8)
				{
					System.out.print("\n");
				}
		}
		return 0;
	}

}

