package <missing>;

public class GlobalMembers
{
	public static final int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	public static final int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
	public static int[][] a = new int[9][9];

	public static int number(int x, int y, int day)
	{
		if (day == 0)
		{
			return a[x][y];
		}

		int v = 0;

		for (int i = 0; i < 8; ++i)
		{
		  if (x + dx[i] >= 0 && x + dx[i] < 9 && y + dy[i] >= 0 && y + dy[i] < 9)
		  {
			  v += number(x + dx[i], y + dy[i], day - 1);
		  }
		}

		v += 2 * number(x, y, day - 1);

		return v;
	}

	public static int Main()
	{
		int m;
		int n;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int j = 0; j < 9; ++j)
		{
		  for (int k = 0; k < 9; ++k)
		  {
			a[j][k] = 0;
		  }
		}

		a[4][4] = m;

		for (int j = 0; j < 9; ++j)
		{
			for (int k = 0; k < 9; ++k)
			{
				if (k != 0)
				{
					System.out.print(" ");
				}
				System.out.print(number(j, k, n));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

