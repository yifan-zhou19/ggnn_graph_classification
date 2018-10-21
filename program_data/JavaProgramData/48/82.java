package <missing>;

public class GlobalMembers
{
	public static int[][] maze = new int[9][9];
	public static int day = 0;
	public static void search(int n)
	{
		while (day != n)
		{
			day++;
			int[][] add = new int[9][9];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(add, 0, (Integer.SIZE / Byte.SIZE));
			for (int i = 4 - day + 1; i <= 4 + day - 1; i++)
			{
				for (int j = 4 - day + 1; j <= 4 + day - 1; j++)
				{
					add[i + 1][j] += maze[i][j];
					add[i - 1][j] += maze[i][j];
					add[i + 1][j + 1] += maze[i][j];
					add[i - 1][j - 1] += maze[i][j];
					add[i + 1][j - 1] += maze[i][j];
					add[i - 1][j + 1] += maze[i][j];
					add[i][j + 1] += maze[i][j];
					add[i][j - 1] += maze[i][j];
					add[i][j] += maze[i][j];
				}
			}
			for (int i = 4 - day; i <= 4 + day; i++)
			{
				for (int j = 4 - day; j <= 4 + day; j++)
				{
					maze[i][j] += add[i][j];
				}
			}
		}
		return;
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		maze[4][4] = m;
		search(n);
		for (int i = 0; i < 9; i++)
		{
			System.out.print(maze[i][0]);
			for (int j = 1; j < 9; j++)
			{
				System.out.print(" ");
				System.out.print(maze[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

