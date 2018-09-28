package <missing>;

public class GlobalMembers
{
	public static char[][] a =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	public static void r(int xf,int yf)
	{
		if (a[xf + 1][yf] == '.')
		{
			a[xf + 1][yf] = 'X';
		}
		if (a[xf][yf - 1] == '.')
		{
			a[xf][yf - 1] = 'X';
		}
		if (a[xf - 1][yf] == '.')
		{
			a[xf - 1][yf] = 'X';
		}
		if (a[xf][yf + 1] == '.')
		{
			a[xf][yf + 1] = 'X';
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 1;x <= n;x++)
		{
			for (y = 1;y <= n;y++)
			{
				a[x][y] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			for (x = 1;x <= n;x++)
			{
				for (y = 1;y <= n;y++)
				{
					if (a[x][y] == '@')
					{
						r(x, y);
					}
				}
			}
			for (x = 1;x <= n;x++)
			{
				for (y = 1;y <= n;y++)
				{
					if (a[x][y] == 'X')
					{
						a[x][y] = '@';
					}
				}
			}
		}
		i = 0;
		for (x = 1;x <= n;x++)
		{
			for (y = 1;y <= n;y++)
			{
				if (a[x][y] == '@')
				{
					i++;
				}
			}
		}
		System.out.print(i);
		System.out.print("\n");
		return 0;
	}
}

