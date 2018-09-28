package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[21][21];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((i > 0 && a[i][j] >= a[i - 1][j]) || (i == 0))
				{
					if ((i < m - 1 && a[i][j] >= a[i + 1][j]) || (i == m - 1))
					{
						if ((j > 0 && a[i][j] >= a[i][j - 1]) || (j == 0))
						{
							if ((j < n - 1 && a[i][j] >= a[i][j + 1]) || (j == n - 1))
							{
								System.out.print(i);
								System.out.print(" ");
								System.out.print(j);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

