package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[102][102];
		int i;
		int j;
		int m;
		int s = 0;

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (m > 1)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '*';
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '*';
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '*';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '*';
						}
					}
				}
			}


			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
			}

			m--;
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					s++;
				}
			}
		}

		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

