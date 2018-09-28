package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] a = new int[9][9];
		int[][] tmp = new int[9][9];
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
				tmp[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						tmp[i][j] = tmp[i][j] + a[i][j] * 2;
						tmp[i + 1][j] = tmp[i + 1][j] + a[i][j];
						tmp[i - 1][j] = tmp[i - 1][j] + a[i][j];
						tmp[i][j + 1] = tmp[i][j + 1] + a[i][j];
						tmp[i][j - 1] = tmp[i][j - 1] + a[i][j];
						tmp[i + 1][j + 1] = tmp[i + 1][j + 1] + a[i][j];
						tmp[i - 1][j - 1] = tmp[i - 1][j - 1] + a[i][j];
						tmp[i + 1][j - 1] = tmp[i + 1][j - 1] + a[i][j];
						tmp[i - 1][j + 1] = tmp[i - 1][j + 1] + a[i][j];
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = tmp[i][j];
					tmp[i][j] = 0;
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j == 8)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

