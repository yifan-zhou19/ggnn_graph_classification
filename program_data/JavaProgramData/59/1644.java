package <missing>;

public class GlobalMembers
{
	//***************************
	//*???????          **
	//*????? 1300012921   **
	//*???2013.11.05        **
	//*************************** 
	public static int Main()

	{
		char[][] a = new char[101][101];
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}

		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int day = 2; day <= m; day++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						if ((i - 1) >= 1 && a[i - 1][j] != '#' && a[i - 1][j] != '@')
						{
							a[i - 1][j] = ',';
						}
						if ((i + 1) <= n != 0 && a[i + 1][j] != '#' && a[i + 1][j] != '@')
						{
							a[i + 1][j] = ',';
						}
						if ((j - 1) >= 1 && a[i][j - 1] != '#' && a[i][j - 1] != '@')
						{
							a[i][j - 1] = ',';
						}
						if ((j + 1) <= n != 0 && a[i][j + 1] != '#' && a[i][j + 1] != '@')
						{
							a[i][j + 1] = ',';
						}
					}
				}
			}

			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (a[i][j] == ',')
					{
						a[i][j] = '@';
					}
				}
			}
		}

		int num = 0;
		for (int i = 1; i <= n; i++)
		{
				for (int j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						num += 1;
					}
				}
		}

		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

