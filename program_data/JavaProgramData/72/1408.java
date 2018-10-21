package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] mount = new int[20][20];
		int m;
		int n;
		int i;
		int j;
		int left;
		int right;
		int up;
		int down;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				mount[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (j - 1 < 0)
				{
					left = 1;
				}
				else
				{
					if (mount[i][j - 1] <= mount[i][j])
					{
						left = 1;
					}
					else
					{
						left = 0;
					}
				}
				if (j + 1 == n)
				{
					right = 1;
				}
				else
				{
					if (mount[i][j + 1] <= mount[i][j])
					{
						right = 1;
					}
					else
					{
						right = 0;
					}
				}
				if (i - 1 < 0)
				{
					up = 1;
				}
				else
				{
					if (mount[i - 1][j] <= mount[i][j])
					{
						up = 1;
					}
					else
					{
						up = 0;
					}
				}
				if (i + 1 == m)
				{
					down = 1;
				}
				else
				{
					if (mount[i + 1][j] <= mount[i][j])
					{
						down = 1;
					}
					else
					{
						down = 0;
					}
				}
				if (left + right + up + down == 4)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

