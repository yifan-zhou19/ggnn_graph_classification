package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[4][4] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					b[i][j] += 2 * a[i][j];
					b[i - 1][j] += a[i][j];
					b[i - 1][j - 1] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
					b[i + 1][j] += a[i][j];
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
		}
					for (i = 0;i < 9;i++)
					{
				for (j = 0;j < 9;j++)
				{
					if (j == 0)
					{
					System.out.printf("%d",a[i][j]);
					}
					else
					{
						System.out.printf(" %d",a[i][j]);
					}
				}
				System.out.print("\n");
					}
					return 0;
	}
}

