package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int day;
		int[][] a = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		while (day-- != 0)
		{
			int[][] b = new int[9][9];
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (a[i][j] > 0)
					{
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
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					a[i][j] = 2 * a[i][j] + b[i][j];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j == 0)
				{
					System.out.print(a[i][j]);
				}
				else if (j == 8)
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				else if (j > 0 && j < 8)
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
			}
		}
		return 0;
	}
}

