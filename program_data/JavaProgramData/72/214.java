package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] h = new int[22][22];
		int i;
		int j;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i <= m + 1; i++)
		{
			h[i][0] = h[i][n + 1] = 0;
		}
		for (j = 1; j <= n; j++)
		{
			h[0][j] = h[m + 1][j] = 0;
		}

		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1])
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

