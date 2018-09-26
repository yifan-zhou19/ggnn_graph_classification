package <missing>;

public class GlobalMembers
{
	public static int[] dx = {0, 1, -1, 0, 1, 1, -1, -1};
	public static int[] dy = {1, 0, -1, -1, 1, -1, 0, 1};

	public static int Main()
	{
		long m;
		long day;
		long[][][] a = new long[5][10][10];
		m = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		day = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0;z <= day;z++)
		{
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 9;j++)
				{
					a[z][i][j] = 0;
				}
			}
		}
		a[0][5][5] = m;
		for (int i = 0;i < day;i++)
		{
			for (int x = 1;x <= 9;x++)
			{
				for (int y = 1;y <= 9;y++)
				{
					for (int k = 0;k < 8;k++)
					{
						a[i + 1][x + dx[k]][y + dy[k]] += a[i][x][y];
					}
					a[i + 1][x][y] += a[i][x][y] * 2;
				}
			}
		}
		for (int x = 1;x <= 9;x++)
		{
			System.out.print(a[day][x][1]);
			for (int y = 2;y <= 9;y++)
			{
				System.out.print(" ");
				System.out.print(a[day][x][y]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

