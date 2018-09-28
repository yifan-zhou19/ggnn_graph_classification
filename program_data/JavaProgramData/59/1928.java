package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int n;
	public static int t = 1;
	public static char[][] room = new char[101][101];
	public static void F(int x, int y)
	{
		if (x - 1 >= 0)
		{
			if (room[x - 1][y] == 0)
			{
				sum++;
				room[x - 1][y] = t + 1;
			}
		}
		if (y - 1 >= 0)
		{
			if (room[x][y - 1] == 0)
			{
				sum++;
				room[x][y - 1] = t + 1;
			}
		}
		if (x + 1 < n)
		{
			if (room[x + 1][y] == 0)
			{
				sum++;
				room[x + 1][y] = t + 1;
			}
		}
		if (y + 1 < n)
		{
			if (room[x][y + 1] == 0)
			{
				sum++;
				room[x][y + 1] = t + 1;
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (room[i][j])
				{
				case '@' :
					room[i][j] = 1;
					sum++;
					break;
				case '.' :
					room[i][j] = 0;
					break;
				case '#' :
					room[i][j] = -1;
					break;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t < m)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (room[i][j] == t)
					{
						F(i, j);
					}
				}
			}
			t++;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

