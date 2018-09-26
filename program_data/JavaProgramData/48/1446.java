package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i;
		int j;
		int k;
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
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
		a[5][5] = m;
		b[5][5] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i + 1][j] + b[i - 1][j - 1] + b[i + 1][j - 1] + b[i - 1][j + 1] + b[i + 1][j + 1] + b[i][j + 1] + b[i][j - 1];
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
				b[i][j] = a[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				if (j == 9)
				{
				System.out.printf("%d\n",a[i][j]);
				}
				else
				{
				System.out.printf("%d ",a[i][j]);
				}
			}
		}
		return 0;
	}

}

