package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		char[][] b = new char[102][102];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 101; i++)
		{
			for (j = 0; j <= 101; j++)
			{
				a[i][j] = '#';
				b[i][j] = '#';
			}
		}
		for (i = 1; i <= n ; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int day;
		int d;

		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 2; d <= day; d++)
		{
			if (d % 2 == 0)
			{
				for (i = 1; i <= n ; i++)
				{
					for (j = 1; j <= n; j++)
					{
						if (a[i][j] != '#')
						{
							if (a[i - 1][j] == '@' || a[i + 1][j] == '@' || a[i][j - 1] == '@' || a[i][j + 1] == '@' || a[i][j] == '@')
							{
								b[i][j] = '@';
							}
							else
							{
								b[i][j] = '.';
							}
						}
						else
						{
							b[i][j] = '#';
						}
					}
				}
			}
			else
			{
				for (i = 1; i <= n ; i++)
				{
					for (j = 1; j <= n; j++)
					{
						if (b[i][j] != '#')
						{
							if (b[i - 1][j] == '@' || b[i + 1][j] == '@' || b[i][j - 1] == '@' || b[i][j + 1] == '@' || b[i][j] == '@')
							{
								a[i][j] = '@';
							}
							else
							{
								a[i][j] = '.';
							}
						}
						else
						{
							a[i][j] = '#';
						}
					}
				}
			}
		}
		int sum = 0;
		if (day % 2 == 0)
		{
			for (i = 1; i <= n ; i++)
			{
				for (j = 1; j <= n; j++)
				{

					if (b[i][j] == '@')
					{
					sum++;
					}

				}
			}
		}
		else
		{
			for (i = 1; i <= n ; i++)
			{
				for (j = 1; j <= n; j++)
				{

					if (a[i][j] == '@')
					{
					sum++;
					}

				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");











		return 0;





	}
}

