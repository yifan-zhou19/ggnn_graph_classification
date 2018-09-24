package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];

	public static void multiply(int d)
	{
		int i;
		int j;
		if (d != 0)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					b[i][j] += a[i][j] * 2;
					b[i - 1][j] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i - 1][j - 1] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
				}
			}
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
			multiply(d - 1);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int d;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		multiply(n);

		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				if (j == 1)
				{
				System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
				if (j == 9)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

