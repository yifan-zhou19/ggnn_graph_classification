package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static void change(int[][] a, int k)
	{
		if (k == 0)
		{
			return;
		}
		int i;
		int j;
		int[][] sign = new int[9][9];
		int[][] b = new int[9][9];
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if ((a[i][j] != 0) && (sign[i][j] == 0))
				{
					sign[i][j]++;
					b[i][j] = a[i][j];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (sign[i][j] == 1)
				{
					a[i][j] += 2 * b[i][j];
					a[i][j + 1] += b[i][j];
					a[i][j - 1] += b[i][j];
					a[i + 1][j] += b[i][j];
					a[i - 1][j] += b[i][j];
					a[i - 1][j - 1] += b[i][j];
					a[i - 1][j + 1] += b[i][j];
					a[i + 1][j - 1] += b[i][j];
					a[i + 1][j + 1] += b[i][j];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				a[i][j] = a[i][j] - b[i][j];
			}
		}
		change(a, k - 1);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		change(a, n);
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j != 8)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(a[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

