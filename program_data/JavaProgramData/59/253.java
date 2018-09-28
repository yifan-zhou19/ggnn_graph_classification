package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		char[][] a =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char x;
		char[][] b = new char[102][102];

		int i;
		int j;
		int n;
		int t;
		int i1;
		int j1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			cin.get(x);
			for (j = 1;j <= n;j++)
			{
				cin.get(a[i][j]);
			}

		}
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 1;
		while (sum < t)
		{
			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '#')
				{
					b[i][j] = '#';
				}
				if (a[i][j] == '@')
				{
					b[i][j] = '@';

						if (a[i - 1][j] != '#')
						{
							b[i - 1][j] = '@';
						}
						else
						{
							b[i - 1][j] = '#';
						}

						if (a[i + 1][j] != '#')
						{
							b[i + 1][j] = '@';
						}
						else
						{
							b[i + 1][j] = '#';
						}

					   if (a[i][j - 1] != '#')
					   {
							b[i][j - 1] = '@';
					   }
						else
						{
							b[i][j - 1] = '#';
						}

						if (a[i][j + 1] != '#')
						{
							b[i][j + 1] = '@';
						}
						else
						{
							b[i][j + 1] = '#';
						}

				}

			}
			}

			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = b[i][j];
			}
			}
			sum++;
		}


		int countt = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			if (a[i][j] == '@')
			{
				countt++;
			}
			}
		}
		System.out.print(countt);

	return 0;
	}

}

