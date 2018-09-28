package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] now = new int[11][11];
		int[][] pre = new int[11][11];
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				now[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		now[5][5] = m;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				for (k = 0;k <= 10;k++)
				{
					pre[j][k] = 0;
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					pre[j - 1][k - 1] += now[j][k];
					pre[j][k - 1] += now[j][k];
					pre[j + 1][k - 1] += now[j][k];
					pre[j - 1][k] += now[j][k];
					pre[j + 1][k] += now[j][k];
					pre[j - 1][k + 1] += now[j][k];
					pre[j][k + 1] += now[j][k];
					pre[j + 1][k + 1] += now[j][k];
					pre[j][k] += 2 * now[j][k];
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					now[j][k] = pre[j][k];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(now[i][j]);
				System.out.print(" ");
			}
			System.out.print(now[i][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

