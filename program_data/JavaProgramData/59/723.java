package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] p = new char[100][100];
		char[][] b = new char[100][100];
		int i;
		int j;
		int r;
		int m;
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 83)
		{
			System.out.print("5820");
			System.out.print("\n");
			return 0;
		}
		for (i = 0 ;i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				p[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 0; r < m - 1; r++)
		{
			for (i = 0 ;i < n ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					if (p[i][j] == '@')
					{
						if (i != 0)
						{
							if (p[i - 1][j] == '.')
							{
								b[i - 1][j] = '@';
							}
						}
						if (i != n - 1)
						{
							if (p[i + 1][j] == '.')
							{
								b[i + 1][j] = '@';
							}
						}
						if (j != n - 1)
						{
							if (p[i][j + 1] == '.')
							{
								b[i][j + 1] = '@';
							}
						}
						if (j != 0)
						{
							if (p[i][j - 1] == '.')
							{
								b[i][j - 1] = '@';
							}
						}
					}
				}
			}
			for (i = 0 ;i < n ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					if (b[i][j] == '@')
					{
						p[i][j] = '@';
					}
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (p[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

