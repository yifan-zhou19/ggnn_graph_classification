package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int m;
		int num = 0;
		char[][] grid = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				grid[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (grid[i][j] == '.')
				{
					grid[i][j] = 0;
				}
				if (grid[i][j] == '#')
				{
					grid[i][j] = 1;
				}
				if (grid[i][j] == '@')
				{
					grid[i][j] = 2;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m != 1)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (grid[i][j] == 2)
					{
						if (grid[i - 1][j] == 0)
						{
							grid[i - 1][j] = 3;
						}
						if (grid[i + 1][j] == 0)
						{
							grid[i + 1][j] = 3;
						}
						if (grid[i][j - 1] == 0)
						{
							grid[i][j - 1] = 3;
						}
						if (grid[i][j + 1] == 0)
						{
							grid[i][j + 1] = 3;
						}
					}

				}
			}

			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (grid[i][j] == 3)
					{
						grid[i][j] = 2;
					}
				}
			}
			m--;
		}
		for (i = 0; i < n; i++)
		{
			 for (j = 0; j < n; j++)
			 {
				 if (grid[i][j] == 2)
				 {
					num++;
				 }
			 }
		}
		System.out.print(num);
		System.out.print("\n");

	return 0;

	}
}

