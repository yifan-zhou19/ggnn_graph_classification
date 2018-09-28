package <missing>;

public class GlobalMembers
{
	public static int leap;
	public static int[][] direction =
	{
		{0, 1},
		{0, -1},
		{1, 0},
		{-1, 0},
		{1, 1},
		{-1, -1},
		{1, -1},
		{-1, 1}
	};
	public static int n;

	public static void born(int[][] a, int d)
	{
		int m = 0;
		int w;
		int e;
		int[][] b = new int[9][9];
		if (d == 0)
		{
			return;
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				if (b[i][j] != 0)
				{
					w = b[i][j];
					a[i][j] += 2 * w;
					for (m = 0;m < 8;m++)
					{
						e = b[i + direction[m][0]][j + direction[m][1]];
						a[i + direction[m][0]][j + direction[m][1]] += w;
					}
				}
			}
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				a[i][j] -= b[i][j];
			}
		}
		born(a, d - 1);
	}
	public static int Main()
	{
		int m;
		int[][] a = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		born(a, n);
		for (int i = 0;i < 9;i++)
		{
			leap = 0;
			for (int j = 0;j < 9;j++)
			{
				if (leap == 0)
				{
					leap = 1;
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

