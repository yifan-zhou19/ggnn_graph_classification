package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int day;
		int i;
		int j;
		int[][] con = new int[101][101];
		int[][] add = new int[101][101];
		int sum = 0;
		char[][] maze = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (j == 0)
				{
					System.in.read();
				}
				maze[i][j] = System.in.read();
				if (maze[i][j] == '.')
				{
					con[i][j] = -1;
				}
				else if (maze[i][j] == '#')
				{
					con[i][j] = 0;
				}
				else if (maze[i][j] == '@')
				{
					con[i][j] = 1;
				}
			}
		}

		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < day - 1;k++)
		{

			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (con[i][j] == 1)
					{
						if (i > 0 && con[i - 1][j] == -1)
						{
							add[i - 1][j] = 2;
						}
						if (i < n && con[i + 1][j] == -1)
						{
							add[i + 1][j] = 2;
						}
						if (j > 0 && con[i][j - 1] == -1)
						{
							add[i][j - 1] = 2;
						}
						if (j < n && con[i][j + 1] == -1)
						{
							add[i][j + 1] = 2;
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					con[i][j] = con[i][j] + add[i][j];
					add[i][j] = 0;
				}
			}

		}

			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (con[i][j] == 1)
					{
						sum++;
					}
				}
			}
			System.out.print(sum);
		return 0;
	}


}

