package <missing>;

public class GlobalMembers
{
	public static int[][][] s = new int[6][11][11];
	public static int m;
	public static int n;

	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s[0][5][5] = m;

		for (int day = 0; day < n; ++day)
		{
			for (int x = 1; x < 10; ++x)
			{
			for (int y = 1; y < 10; ++y)
			{
				s[day + 1][x][y] += 2 * s[day][x][y];
				s[day + 1][x - 1][y] += s[day][x][y];
				s[day + 1][x + 1][y] += s[day][x][y];
				s[day + 1][x][y - 1] += s[day][x][y];
				s[day + 1][x][y + 1] += s[day][x][y];
				s[day + 1][x - 1][y - 1] += s[day][x][y];
				s[day + 1][x + 1][y + 1] += s[day][x][y];
				s[day + 1][x + 1][y - 1] += s[day][x][y];
				s[day + 1][x - 1][y + 1] += s[day][x][y];
			}
			}
		}

		for (int x = 1; x < 10; ++x)
		{
			for (int y = 1; y < 9; ++y)
			{
				System.out.print(s[n][x][y]);
				System.out.print(' ');
			}
			System.out.print(s[n][x][9]);
			System.out.print("\n");
		}

	}
}

