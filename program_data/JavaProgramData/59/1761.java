package <missing>;

public class GlobalMembers
{
	//*********************************************
	//*???????                             *
	//*??????                               *
	//*???1300012888                           *
	//*???2013.11.12                           *
	//*********************************************

	public static int Main()
	{
		char[][] area = new char[101][101];
		int n;
		int i;
		int j;
		int m;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 100; i++)
		{
			for (j = 0; j <= 100; j++)
			{
				area[i][j] = '#';
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				area[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= m - 1; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (area[i][j] == '@')
					{
						if (area[i - 1][j] == '.')
						{
							area[i - 1][j] = '%';
						}
						if (area[i + 1][j] == '.')
						{
							area[i + 1][j] = '%';
						}
						if (area[i][j - 1] == '.')
						{
							area[i][j - 1] = '%';
						}
						if (area[i][j + 1] == '.')
						{
							area[i][j + 1] = '%';
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (area[i][j] == '%')
					{
						area[i][j] = '@';
					}
				}
			}

		}
		k = 0;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (area[i][j] == '@')
				{
					k++;
				}
			}
		}
		System.out.print(k);
		System.out.print("\n");

		return 0;
	}
}

