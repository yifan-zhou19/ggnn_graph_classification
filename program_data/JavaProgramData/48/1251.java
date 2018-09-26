package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		int m;
		int n;
		int i;
		int j;
		int d;
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
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
		a[5][5] = m;
		for (d = 0;d < n;d++)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
				b[i][j] = a[i][j];
				}
			}
			for (i = 5 - d;i <= 5 + d;i++)
			{
				for (j = 5 - d;j <= 5 + d;j++)
				{
					a[i][j] = b[i][j] * 2 + a[i][j] - b[i][j];
					a[i - 1][j - 1] = b[i][j] + a[i - 1][j - 1];
					a[i - 1][j] = b[i][j] + a[i - 1][j];
					a[i - 1][j + 1] = b[i][j] + a[i - 1][j + 1];
					a[i][j - 1] = b[i][j] + a[i][j - 1];
					a[i][j + 1] = b[i][j] + a[i][j + 1];
					a[i + 1][j - 1] = b[i][j] + a[i + 1][j - 1];
					a[i + 1][j] = b[i][j] + a[i + 1][j];
					a[i + 1][j + 1] = b[i][j] + a[i + 1][j + 1];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
			System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][9]);
		}
		return 0;
	}

}

