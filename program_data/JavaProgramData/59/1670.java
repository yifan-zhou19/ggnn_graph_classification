package <missing>;

public class GlobalMembers
{
	/*
	 *@file 5.cpp
	 *@author ???
	 *@date 11?3?
	 *@description ????
	 */

	public static int Main()
	{
		int n;
		int m;
		char[][] a = new char[200][200];
		char[][] b = new char[200][200];
		int i;
		int j;
		int k;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n; i++)
		{
			for (j = 0; j <= n; j++)
			{
				b[i][j] = '0';
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m-- != 0)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					b[i][j] = a[i][j];
				}
			}

			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (b[i][j] == '.' && (b[i - 1][j] == '@' || b[i + 1][j] == '@' || b[i][j - 1] == '@' || b[i][j + 1] == '@' || b[i][j - 1] == '@'))
					{
						a[i][j] = '@';
					}
				}
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

