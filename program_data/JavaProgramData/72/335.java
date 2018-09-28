package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int M = m;
		final int N = n;
		int[][] mount = new int[M][N];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				mount[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i > 0)
				{
					if (mount[i - 1][j] > mount[i][j])
					{
						continue;
					}
				}
				if (j > 0)
				{
					if (mount[i][j - 1] > mount[i][j])
					{
						continue;
					}
				}
				if (i < m - 1)
				{
					if (mount[i + 1][j] > mount[i][j])
					{
						continue;
					}
				}
				if (j < n - 1)
				{
					if (mount[i][j + 1] > mount[i][j])
					{
						continue;
					}
				}
				System.out.print(i);
				System.out.print(' ');
				System.out.print(j);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

