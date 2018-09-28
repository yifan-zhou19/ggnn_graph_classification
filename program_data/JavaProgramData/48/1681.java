package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[4][4] = m;
		b[4][4] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (i != 0 && i != 8 && j != 0 && j != 8)
					{
						a[i][j] = 2 * b[i][j] + b[i][j - 1] + b[i][j + 1] + b[i - 1][j] + b[i + 1][j] + b[i - 1][j - 1] + b[i - 1][j + 1] + b[i + 1][j - 1] + b[i + 1][j + 1];
					}
					if (i == 0 && j == 0)
					{
						a[i][j] = 2 * b[i][j] + b[i][j + 1] + b[i + 1][j] + b[i + 1][j + 1];
					}
					if (i == 8 && j == 0)
					{
						a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i][j + 1] + b[i - 1][j + 1];
					}
					if (i == 0 && j == 8)
					{
						a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i + 1][j] + b[i + 1][j - 1];
					}
					if (i == 8 && j == 8)
					{
						a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i][j - 1] + b[i - 1][j - 1];
					}
					if (i == 0 && j != 0 && j != 8)
					{
						a[i][j] = 2 * b[i][j] + b[i][j - 1] + b[i][j + 1] + b[i + 1][j] + b[i + 1][j - 1] + b[i + 1][j + 1];
					}
					if (i == 8 && j != 0 && j != 8)
					{
						a[i][j] = 2 * b[i][j] + b[i][j - 1] + b[i][j + 1] + b[i - 1][j] + b[i - 1][j - 1] + b[i - 1][j + 1];
					}
					if (j == 0 && i != 0 && i != 8)
					{
						a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i + 1][j] + b[i][j + 1] + b[i - 1][j + 1] + b[i + 1][j + 1];
					}
					if (j == 8 && i != 0 && i != 8)
					{
						a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i + 1][j] + b[i][j - 1] + b[i - 1][j - 1] + b[i + 1][j - 1];
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					b[i][j] = a[i][j];
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
				else if (j == 8)
				{
					System.out.printf(" %d\n",a[i][j]);
				}
				else
				{
					System.out.printf(" %d",a[i][j]);
				}
			}
		}
		return 0;
	}










}

