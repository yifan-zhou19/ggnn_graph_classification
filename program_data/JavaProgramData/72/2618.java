package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] hill = new int[m + 2][n + 2];
		for (int i = 0;i < (m + 2) * (n + 2);i++)
		{
			hill[0][i] = 0;
		}

		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				hill[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i][j + 1] != 0 && hill[i][j] >= hill[i][j - 1])
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
	}

}

