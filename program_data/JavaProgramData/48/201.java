package <missing>;

public class GlobalMembers
{
	public static void fanzhi(int[][] a, int[][] b, int n, int count)
	{
		int i;
		int j;
		if (count == n)
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (j == 8)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
					else
					{
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
				}
			}
		}
		else
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (b[i][j] > 0)
					{
						a[i - 1][j] += b[i][j];
						a[i - 1][j - 1] += b[i][j];
						a[i - 1][j + 1] += b[i][j];
						a[i][j - 1] += b[i][j];
						a[i][j + 1] += b[i][j];
						a[i + 1][j - 1] += b[i][j];
						a[i + 1][j] += b[i][j];
						a[i + 1][j + 1] += b[i][j];
						a[i][j] += b[i][j];
					}
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					b[i][j] = a[i][j];
				}
			}
			count++;
			fanzhi(a, b, n, count);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		b[4][4] = m;
		fanzhi(a, b, n, 0);
		return 0;
	}
}

