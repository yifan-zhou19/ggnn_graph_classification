package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int n = 9;
		int init;
		int days;
		int[][][] m = new int[2][n + 2][n + 2];
		init = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[0][5][5] = init;
		for (int k = 0; k < days; k++)
		{
			for (int i = 0; i <= n + 1; i++)
			{
				for (int j = 0; j <= n + 1; j++)
				{
					m[1 - k % 2][i][j] = 0;
				}
			}
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (m[k % 2][i][j] != 0)
					{
						m[1 - k % 2][i + 1][j + 1] += m[k % 2][i][j];
						m[1 - k % 2][i + 1][j] += m[k % 2][i][j];
						m[1 - k % 2][i + 1][j - 1] += m[k % 2][i][j];
						m[1 - k % 2][i][j + 1] += m[k % 2][i][j];
						m[1 - k % 2][i][j - 1] += m[k % 2][i][j];
						m[1 - k % 2][i - 1][j + 1] += m[k % 2][i][j];
						m[1 - k % 2][i - 1][j] += m[k % 2][i][j];
						m[1 - k % 2][i - 1][j - 1] += m[k % 2][i][j];
						m[1 - k % 2][i][j] += m[k % 2][i][j] * 2;
					}
				}
			}
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				System.out.print(m[days % 2][i][j]);
				if (j == n)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(' ');
				}
			}
		}
		return 0;
	}

}

