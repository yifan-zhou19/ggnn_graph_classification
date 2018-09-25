package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] mount = new int[22][22];
		int i;
		int j;
		for (i = 0; i <= m + 1; i++)
		{
			for (j = 0; j <= n + 1; j++)
			{
				if (i == 0 || i == m + 1 || j == 0 || j == n + 1)
				{
					mount[i][j] = 0;
				}
				else
				{
					mount[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (mount[i][j] >= mount[i - 1][j] != 0 && mount[i][j] >= mount[i + 1][j] != 0 && mount[i][j] >= mount[i][j + 1] != 0 && mount[i][j] >= mount[i][j - 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

