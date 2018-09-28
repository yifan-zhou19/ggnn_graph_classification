package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int m;
	public static int n;

	public static int high(int x,int y)
	{
		if (x != 0 && a[x - 1][y] > a[x][y])
		{
			return 0;
		}
		if (y != 0 && a[x][y - 1] > a[x][y])
		{
			return 0;
		}
		if (x != m && a[x + 1][y] > a[x][y])
		{
			return 0;
		}
		if (y != n && a[x][y + 1] > a[x][y])
		{
			return 0;
		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int j;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (high(i, j) == 1)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

