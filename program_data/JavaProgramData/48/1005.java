package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = n;
		b[4][4] = n;
		for (m; m > 0; m--)
		{
			int[][] c = new int[9][9];
			for (int i = 0; i < 9; i++)
			{
				for (int j = 0; j < 9; j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] += a[i][j];
						b[i][j + 1] += a[i][j];
						b[i][j - 1] += a[i][j];
						b[i + 1][j] += a[i][j];
						b[i - 1][j] += a[i][j];
						b[i + 1][j + 1] += a[i][j];
						b[i + 1][j - 1] += a[i][j];
						b[i - 1][j + 1] += a[i][j];
						b[i - 1][j - 1] += a[i][j];
					}
				}
			}
			for (int x = 0; x < 9; x++)
			{
				for (int y = 0; y < 9; y++)
				{
					a[x][y] = b[x][y];
				}
			}
		}
		for (int x = 0; x < 9; x++)
		{
			for (int y = 0; y < 9; y++)
			{
				System.out.print(a[x][y]);
				if (y < 8)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			System.out.print("\n");
		}
		return 0;
	}
}

