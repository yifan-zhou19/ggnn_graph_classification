package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p = 0;
		int x;
		int y;
		char[][] dorm = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 1; x <= n; x++)
		{
			for (y = 1; y <= n; y++)
			{
				dorm[x][y] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 0; x <= n + 1; x++)
		{
			dorm[x][n + 1] = '#';
			dorm[x][0] = '#';
			dorm[0][x] = '#';
			dorm[n + 1][x] = '#';
		}
		do
		{
			for (x = 1; x <= n; x++)
			{
				for (y = 1; y <= n; y++)
				{
					if (dorm[x][y] == '@')
					{
				if (dorm[x - 1][y] == '.')
				{
					dorm[x - 1][y] = '!';
				}
				if (dorm[x + 1][y] == '.')
				{
					dorm[x + 1][y] = '!';
				}
				if (dorm[x][y - 1] == '.')
				{
					dorm[x][y - 1] = '!';
				}
				if (dorm[x][y + 1] == '.')
				{
					dorm[x][y + 1] = '!';
				}
					}
				}
			}
			for (x = 1; x <= n; x++)
			{
				for (y = 1; y <= n; y++)
				{
					if (dorm[x][y] == '!')
					{
						dorm[x][y] = '@';
					}
				}
			}
			m--;
		} while (m > 1);
		for (x = 1; x <= n; x++)
		{
			for (y = 1; y <= n; y++)
			{
				if (dorm[x][y] == '@')
				{
					p++;
				}
			}
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

