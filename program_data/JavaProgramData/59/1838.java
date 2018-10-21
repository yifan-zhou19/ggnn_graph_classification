package <missing>;

public class GlobalMembers
{
	public static char[][] maze = new char[100][100];
	public static int n;
	public static int m;
	public static int sum;

	public static void test()
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (maze[i][j] == '@')
				{
					if (i - 1 >= 0 && maze[i - 1][j] == '.')
					{
						maze[i - 1][j] = '!';
					}
					if (i + 1 < n && maze[i + 1][j] == '.')
					{
						maze[i + 1][j] = '!';
					}
					if (j - 1 >= 0 && maze[i][j - 1] == '.')
					{
						maze[i][j - 1] = '!';
					}
					if (j + 1 < n && maze[i][j + 1] == '.')
					{
						maze[i][j + 1] = '!';
					}
				}
			}
		}
	}

	public static void trans()
	{
		int cnt = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (maze[i][j] == '!' || maze[i][j] == '@')
				{
					cnt++;
					if (maze[i][j] == '!')
					{
						maze[i][j] = '@';
					}
				}
			}
		}
		sum = cnt;
	}


	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				maze[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int round = 1;
		trans();
		while (round < m)
		{
			test();
			trans();
			round++;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

