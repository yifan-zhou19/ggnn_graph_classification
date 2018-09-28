package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int f(int x,int y)
	{
		int v = a[x][y] * 2;
		if (x > 0)
		{
			v += a[x - 1][y];
			if (y > 0)
			{
				v += a[x - 1][y - 1];
			}
		}
		if (y > 0)
		{
			v += a[x][y - 1];
			if (x < 8)
			{
				v += a[x + 1][y - 1];
			}
		}
		if (x < 8)
		{
			v += a[x + 1][y];
			if (y < 8)
			{
				v += a[x + 1][y + 1];
			}
		}
		if (y < 8)
		{
			v += a[x][y + 1];
			if (x > 0)
			{
				v += a[x - 1][y + 1];
			}
		}
		return v;
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j <= 8; j++)
			{
				for (k = 0; k <= 8; k++)
				{
					b[j][k] = f(j, k);
				}
			}
			for (j = 0; j <= 8; j++)
			{
				for (k = 0; k <= 8; k++)
				{
					a[j][k] = b[j][k];
				}
			}
		}
		for (j = 0; j <= 8; j++)
		{
			for (k = 0; k < 8; k++)
			{
				System.out.print(a[j][k]);
				System.out.print(" ");
			}
			System.out.print(a[j][8]);
			System.out.print("\n");
		}
		return 0;
	}

}

