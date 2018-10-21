package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int[][] d =
		{
			{0, 1},
			{1, 0},
			{0, -1},
			{-1, 0},
			{1, -1},
			{-1, 1},
			{-1, -1},
			{1, 1}
		};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				for (int k = 0; k < 9; k++)
				{
					if (a[j][k] != 0)
					{
						for (int t = 0; t < 8; t++)
						{
							int x = d[t][0];
							int y = d[t][1];
							b[j + x][k + y] = b[j + x][k + y] + a[j][k];
						}
						b[j][k] = b[j][k] + 2 * a[j][k];
					}
				}
			}
			for (int j = 0; j < 9; j++)
			{
				for (int k = 0; k < 9; k++)
				{
					a[j][k] = b[j][k];
					b[j][k] = 0;
				}
			}
		}
		for (int j = 0; j < 9; j++)
		{
			for (int k = 0; k < 9; k++)
			{
				if (k < 8)
				{
					System.out.print(a[j][k]);
					System.out.print(" ");
				}
				if (k == 8)
				{
					System.out.print(a[j][k]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

