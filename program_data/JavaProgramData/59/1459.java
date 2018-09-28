package <missing>;

public class GlobalMembers
{
	public static int f(char c)
	{
		if (c == '.')
		{
			c = '@';
		}
		return c;
	}
	public static int g(char c)
	{
		if (c == '.')
		{
			c = '*';
		}
		return c;
	}
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		char[][] c = new char[102][102];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int k = 1; k <= m - 1; k++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (c[i][j] != '@')
					{
						continue;
					}
					else
					{
						c[i - 1][j] = f(c[i - 1][j]);
						c[i + 1][j] = g(c[i + 1][j]);
						c[i][j + 1] = g(c[i][j + 1]);
						c[i][j - 1] = f(c[i][j - 1]);
					}
				}
			}
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (c[i][j] == '*')
					{
						c[i][j] = '@';
					}
				}
			}
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				sum += c[i][j] == '@';
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

