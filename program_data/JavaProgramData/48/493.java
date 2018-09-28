package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????               **
	//*?????? 1100012763              **
	//*???2011.11.23                     **
	//****************************************
	public static int[][] zou =
	{
		{-1, -1, -1, 0, 1, 1, 1, 0},
		{-1, 0, 1, 1, 1, 0, -1, -1}
	};
	public static int day;
	public static int[][] flag = new int[9][9];
	public static int[][] map = new int[9][9];
	public static int[][] stack = new int[9][9];

	public static void flood(int count)
	{
		int i;
		int j;
		int k;
		int x;
		int y;
		if (count <= day)
		{
			for (i = 0; i <= 8; i++)
			{
				for (j = 0; j <= 8; j++)
				{
					if (map[i][j] > 0)
					{
						flag[i][j] = 1;
						stack[i][j] = map[i][j];
					}
				}
			}
			for (i = 0; i <= 8; i++)
			{
				for (j = 0; j <= 8; j++)
				{
					if (flag[i][j] > 0)
					{
						for (k = 0; k <= 7; k++)
						{
							x = i + zou[0][k];
							y = j + zou[1][k];
							if (x < 0 || y < 0 || x > 8 || y > 8)
							{
								continue;
							}
							map[x][y] = map[x][y] + stack[i][j];
						}
						map[i][j] = map[i][j] + 2 * stack[i][j];
						map[i][j] = map[i][j] - stack[i][j];
					}
				}
			}
			flood(count + 1);
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 8; i++)
		{
			for (j = 0; j <= 8; j++)
			{
				map[i][j] = 0;
				flag[i][j] = 0;
				stack[i][j] = 0;
			}
		}
		map[4][4] = num;
		flood(1);

		for (i = 0; i <= 8; i++)
		{
			if (i > 0)
			{
				System.out.print("\n");
			}
			for (j = 0; j <= 8; j++)
			{
				if (j > 0)
				{
					System.out.print(' ');
				}
				System.out.print(map[i][j]);
			}
		}

		return 0;
	}

}

