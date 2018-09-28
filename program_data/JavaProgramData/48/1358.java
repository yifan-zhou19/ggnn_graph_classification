package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
		int w;
		int i;
		int j;
		int c;
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
		for (w = 1;w <= n;w++)
		{
			for (i = 1;i <= 9;i++)
			{
			for (j = 1;j <= 9;j++)
			{
			b[i - 1][j - 1] = 0;
			}
			}
			for (i = 1;i <= 9;i++)
			{
			for (j = 1;j <= 9;j++)
			{
				c = a[i - 1][j - 1];
				if (c != 0)
				{
					b[i - 2][j - 2] = b[i - 2][j - 2] + c;
					b[i - 2][j - 1] = b[i - 2][j - 1] + c;
					b[i - 2][j] = b[i - 2][j] + c;
					b[i - 1][j - 2] = b[i - 1][j - 2] + c;
					b[i - 1][j] = b[i - 1][j] + c;
					b[i][j - 2] = b[i][j - 2] + c;
					b[i][j - 1] = b[i][j - 1] + c;
					b[i][j] = b[i][j] + c;
					b[i - 1][j - 1] = b[i - 1][j - 1] + c;
				}
			}
			}
			for (i = 1;i <= 9;i++)
			{
			for (j = 1;j <= 9;j++)
			{
			a[i - 1][j - 1] = a[i - 1][j - 1] + b[i - 1][j - 1];
			}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
			System.out.printf("%d ",a[i - 1][j - 1]);
			}
			System.out.printf("%d\n",a[i - 1][8]);
		}
		return 0;
	}
}

