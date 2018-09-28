package <missing>;

public class GlobalMembers
{
	public static void germ(int[][] a, int[][] b, int n)
	{
		int i;
		int j;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j >= 1)
				{
					b[i][j - 1] += a[i][j];
				}
				if (i >= 1 && j >= 1)
				{
					b[i - 1][j - 1] += a[i][j];
				}
				if (i >= 1)
				{
					b[i - 1][j] += a[i][j];
				}
				if (i <= 7 && j >= 1)
				{
					b[i + 1][j - 1] += a[i][j];
				}
				if (i <= 7 && j <= 7)
				{
					b[i + 1][j + 1] += a[i][j];
				}
				if (i >= 1 && j <= 7)
				{
					b[i - 1][j + 1] += a[i][j];
				}
				if (j <= 7)
				{
					b[i][j + 1] += a[i][j];
				}
				if (i <= 7)
				{
					b[i + 1][j] += a[i][j];
				}
				b[i][j] += a[i][j];
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = b[i][j];
			}
		}
		n -= 1;
		if (n > 0)
		{
			germ(a, b, n);
		}
		else if (n == 0)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 8;j++)
				{
					System.out.printf("%d ",b[i][j]);
				}
				System.out.printf("%d\n",b[i][j]);
			}
		}
	}

	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
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
		germ(a, b, n);
	}
}

