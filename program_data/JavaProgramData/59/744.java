package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][100];
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int m;
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				s[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1 ; k < m ; k++)
		{
			for (i = 0 ; i < n ; i++)
			{
				for (j = 0; j < n ; j++)
				{
					if (s[i][j] == '@')
					{
						if (j - 1 >= 0)
						{
							if (s[i][j - 1] != '#')
							{
								a[i][j - 1] = '@';
							}
						}
						if (j + 1 < n)
						{
							if (s[i][j + 1] != '#')
							{
								a[i][j + 1] = '@';
							}
						}
						if (i - 1 >= 0)
						{
							if (s[i - 1][j] != '#')
							{
								a[i - 1][j] = '@';
							}
						}
						if (i + 1 < n)
						{
							if (s[i + 1][j] != '#')
							{
								a[i + 1][j] = '@';
							}
						}
					}
				}
			}
			for (i = 0 ; i < n ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					if (a[i][j] == '@')
					{
						s[i][j] = '@';
					}
				}
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				if (s[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

