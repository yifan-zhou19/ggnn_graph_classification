package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int[][] c = new int[9][9];
		int i;
		int j;
		int m;
		int n;
		int k;
		int p;
		int q;
		for (i = 0;i < 9;i++)
		{
		for (j = 0;j < 9;j++)
		{
						a[i][j] = 0;
						b[i][j] = 0;
						c[i][j] = 0;
		}
		}
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
		a[4][4] = m;
		for (k = 0;k < n;k++)
		{
						for (i = 0;i < 9;i++)
						{
						for (j = 0;j < 9;j++)
						{
						 if (a[i][j] != 0)
						 {
									   b[i][j] = b[i][j] + 3 * a[i][j];
									   b[i][j - 1] += a[i][j];
										b[i - 1][j] += a[i][j];
									  b[i - 1][j - 1] += a[i][j];
									  b[i - 1][j + 1] += a[i][j];
										b[i][j + 1] += a[i][j];
									   b[i + 1][j] += a[i][j];
									   b[i + 1][j + 1] += a[i][j];
									   b[i + 1][j - 1] += a[i][j];
						 }
						}
						}

		for (p = 0;p < 9;p++)
		{
		for (q = 0;q < 9;q++)
		{
						a[p][q] = b[p][q] - a[p][q];
						b[p][q] = 0;
		}
		}
		}
		for (i = 0;i < 9;i++)
		{
		for (j = 0;j < 9;j++)
		{
						if (j == 8)
						{
						System.out.printf("%d\n",a[i][j]);
						}
						else
						{
							System.out.printf("%d ",a[i][j]);
						}
		}
		}
	}



}

