package <missing>;

public class GlobalMembers
{
	public static void fanzhi(int[][] a, int n)
	{
		int i;
		int j;
		int[][] b = new int[11][11];
		if (n == 0)
		{
			return;
		}
		else
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] += 2 * a[i][j];
						b[i - 1][j - 1] += a[i][j];
						b[i - 1][j] += a[i][j];
						b[i - 1][j + 1] += a[i][j];
						b[i][j - 1] += a[i][j];
						b[i][j + 1] += a[i][j];
						b[i + 1][j - 1] += a[i][j];
						b[i + 1][j] += a[i][j];
						b[i + 1][j + 1] += a[i][j];
					}
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
			fanzhi(a, n - 1);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		fanzhi(a, n);
		int i;
		int j;
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j != 1)
				{
					System.out.print(" ");
				}
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

