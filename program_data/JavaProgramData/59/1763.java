package <missing>;

public class GlobalMembers
{
	//**************************************
	//* ???????                     *
	//* ????? 1300017657              *
	//* ???2013.11.12                   *
	//**************************************

	public static int Main()
	{
		int n;
		int m;
		int num = 0;
		char[][] a = new char[102][102];
		char[][] b = new char[102][102];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int d = 1; d < m; d++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
						if (a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
						if (a[i][j + 1] == '.')
						{
							b[i][j + 1] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
					}
				}
			}

			for (int p = 1; p <= n; p++)
			{
				for (int q = 1; q <= n; q++)
				{
					a[p][q] = b[p][q];
				}
			}
		}

		for (int r = 1; r <= n; r++)
		{
			for (int s = 1; s <= n; s++)
			{
				if (a[r][s] == '@')
				{
					num++;
				}
			}
		}

		System.out.print(num);

		return 0;
	}
}

