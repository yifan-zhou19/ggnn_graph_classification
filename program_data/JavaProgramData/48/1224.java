package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[9][9];
		int[][] b = new int[10][10];
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
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
			}
		}
		a[4][4] = m;
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				b[i][j] = 0;
			}
		}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					b[i][j] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i][j + 2] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i + 1][j + 2] += a[i][j];
					b[i + 2][j] += a[i][j];
					b[i + 2][j + 1] += a[i][j];
					b[i + 2][j + 2] += a[i][j];
										b[i + 1][j + 1] += a[i][j] * 2;
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i + 1][j + 1];
					b[i + 1][j + 1] = 0;
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

