package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int number = 0;
		char p;
		char[][] str = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = System.in.read();
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				str[i][j] = System.in.read();
				if (j == n)
				{
					p = System.in.read();
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= m - 1; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (str[i][j] == '@')
					{
						if (str[i - 1][j] != '#' && str[i - 1][j] != '@')
						{
							str[i - 1][j] = '0';
						}
						if (str[i + 1][j] != '#' && str[i + 1][j] != '@')
						{
							str[i + 1][j] = '0';
						}
						if (str[i][j - 1] != '#' && str[i][j - 1] != '@')
						{
							str[i][j - 1] = '0';
						}
						if (str[i][j + 1] != '#' && str[i][j + 1] != '@')
						{
							str[i][j + 1] = '0';
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (str[i][j] == '0')
					{
						str[i][j] = '@';
					}
				}
			}

		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (str[i][j] == '@')
				{
					number++;
				}
			}
		}
		System.out.print(number);
		return 0;
	}

}

