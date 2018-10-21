package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int tian;
		int i;
		int j;
		int[][][] num = new int[6][11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (tian = 0;tian <= n + 1;tian++)
		{
			for (i = 0;i <= 10;i++)
			{
				for (j = 0;j <= 10;j++)
				{
					num[tian][i][j] = 0;
				}
			}
		}
		num[1][5][5] = m;
		for (tian = 1;tian <= n;tian++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					num[tian + 1][i][j] = 2 * num[tian][i][j] + num[tian][i - 1][j - 1] + num[tian][i - 1][j] + num[tian][i - 1][j + 1] + num[tian][i][j - 1] + num[tian][i][j + 1] + num[tian][i + 1][j - 1] + num[tian][i + 1][j] + num[tian][i + 1][j + 1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j != 9)
				{
					System.out.print(num[n + 1][i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(num[n + 1][i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

