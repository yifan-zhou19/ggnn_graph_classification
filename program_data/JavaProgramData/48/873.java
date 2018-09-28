package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[10][10];
		int[][] t =
		{
			{0, 1},
			{0, -1},
			{1, 1},
			{1, -1},
			{1, 0},
			{-1, 1},
			{-1, 0},
			{-1, -1}
		};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		while (n-- != 0)
		{
			int[][] b = new int[10][10];
			for (int i = 1; i <= 9; i++)
			{
			for (int j = 1; j <= 9; j++)
			{
				if (a[i][j] != 0)
				{
					for (int k = 0; k < 8; k++)
					{
						b[i + t[k][0]][j + t[k][1]] += a[i][j];
					}
					b[i][j] += a[i][j] * 2;
				}
			}
			}
			for (int i = 1; i <= 9; i++)
			{
			for (int j = 1; j <= 9; j++)
			{
				a[i][j] = b[i][j];
			}
			}
		}
		for (int i = 1; i <= 9 ; i++)
		{
			System.out.print(a[i][1]);
			for (int j = 2; j <= 9; j++)
			{
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}

		return 0;
	}

}

