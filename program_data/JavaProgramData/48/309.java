package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];

	public static void start(int n)
	{
		a[5][5] = n;
	}


	public static void day()
	{
		int[][] b = new int[11][11];
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9;j++)
			{
				b[i][j] = 0;
			}
		}
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9;j++)
			{
				b[i][j] += 2 * a[i][j];
				b[i - 1][j] += a[i][j];
				b[i + 1][j] += a[i][j];
				b[i][j - 1] += a[i][j];
				b[i][j + 1] += a[i][j];
				b[i - 1][j - 1] += a[i][j];
				b[i + 1][j + 1] += a[i][j];
				b[i + 1][j - 1] += a[i][j];
				b[i - 1][j + 1] += a[i][j];
			}
		}
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9;j++)
			{
				a[i][j] = b[i][j];
			}
		}
	}


	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		start(n);
		while (m-- != 0)
		{
			day();
		}

		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1;j < 9 ;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][9]);
		}
		return 0;
	}


}

