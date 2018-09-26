package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] xijun = new int[11][11];
		int[][] next = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				xijun[i][j] = 0;
				next[i][j] = 0;
			}
		}
		xijun[5][5] = next[5][5] = m;
		for (i = 1;i <= n;i++)
		{

			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
						next[j][k] += xijun[j][k];
						next[j - 1][k] += xijun[j][k];
						next[j - 1][k - 1] += xijun[j][k];
						next[j - 1][k + 1] += xijun[j][k];
						next[j][k - 1] += xijun[j][k];
						next[j][k + 1] += xijun[j][k];
						next[j + 1][k - 1] += xijun[j][k];
						next[j + 1][k] += xijun[j][k];
						next[j + 1][k + 1] += xijun[j][k];
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					xijun[j][k] = next[j][k];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(xijun[i][j]);
				System.out.print(" ");
			}
			System.out.print(xijun[i][9]);
			System.out.print("\n");
		}
		return 0;
	}

}

