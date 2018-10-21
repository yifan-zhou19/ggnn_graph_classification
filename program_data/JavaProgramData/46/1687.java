package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[999][999];
	public static int f1(int x, int y)
	{
		System.out.print(a[x][y]);
		System.out.print("\n");
		a[x][y] = -9876;
		while (true)
		{
			if (a[x][y + 1] != -9876)
			{
				y++;
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -9876;
			}
			else if (a[x + 1][y] != -9876)
			{
				return (f2(x + 1, y));
			}
			else
			{
				return 0;
			}
		}
	}
	public static int f2(int x, int y)
	{
		System.out.print(a[x][y]);
		System.out.print("\n");
		a[x][y] = -9876;
		while (true)
		{
			if (a[x + 1][y] != -9876)
			{
				x++;
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -9876;
			}
			else if (a[x][y - 1] != -9876)
			{
				return (f3(x, y - 1));
			}
			else
			{
				return 0;
			}
		}
	}
	public static int f3(int x, int y)
	{
		System.out.print(a[x][y]);
		System.out.print("\n");
		a[x][y] = -9876;
		while (true)
		{
			if (a[x][y - 1] != -9876)
			{
				y--;
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -9876;
			}
			else if (a[x - 1][y] != -9876)
			{
				return (f4(x - 1, y));
			}
			else
			{
				return 0;
			}
		}
	}
	public static int f4(int x, int y)
	{
		System.out.print(a[x][y]);
		System.out.print("\n");
		a[x][y] = -9876;
		while (true)
		{
			if (a[x - 1][y] != -9876)
			{
				x--;
				System.out.print(a[x][y]);
				System.out.print("\n");
				a[x][y] = -9876;
			}
			else if (a[x][y + 1] != -9876)
			{
				return (f1(x, y + 1));
			}
			else
			{
				return 0;
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
	for (i = 0;i <= 998;i++)
	{
		for (j = 0;j <= 998;j++)
		{
			a[i][j] = -9876;
		}
	}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		f1(1, 1);
		return 0;
	}

}

