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
		int[][] b = new int[22][22];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
		}
		for (j = 0;j <= n + 1;j++) //???????????????????????????0???????????
		{
			b[0][j] = 0;
			b[m + 1][j] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			b[i][0] = 0;
			b[i][n + 1] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				b[i][j] = h[i - 1][j - 1];
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (b[i][j] >= b[i - 1][j] != 0 && b[i][j] >= b[i + 1][j] != 0 && b[i][j] >= b[i][j + 1] != 0 && b[i][j] >= b[i][j - 1])
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

