package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012934 **
	//*???2013.11.6  **
	//********************************


	public static int Main()
	{
		int n;
		int m;
		int s;
		char[][] a = new char[102][102]; //??????????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 0;
		for (int i = 1; i <= n ; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m != 1)
		{
			for (int k = 2; k <= m; k++)
			{
				for (int i = 1; i <= n; i++)
				{
					for (int j = 1; j <= n; j++)
					{
						if (a[i][j] == '@') //????
						{
							if (a[i - 1][j] != '#' && a[i - 1][j] != '@')
							{
								a[i - 1][j] = '!'; //!??????????
							}
							if (a[i + 1][j] != '#' && a[i + 1][j] != '@')
							{
								a[i + 1][j] = '!';
							}
							if (a[i][j - 1] != '#' && a[i][j - 1] != '@')
							{
								a[i][j - 1] = '!';
							}
							if (a[i][j + 1] != '#' && a[i][j + 1] != '@')
							{
								a[i][j + 1] = '!';
							}
						}
					}
				}
				for (int i = 1; i <= n; i++)
				{
					for (int j = 1; j <= n; j++)
					{
						if (a[i][j] == '!')
						{
							a[i][j] = '@'; //???????????????????
						}
					}
				}
			}
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					s++;
				}
			}
		}
		System.out.print(s);

		return 0;

	}

}

