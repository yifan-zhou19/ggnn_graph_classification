package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int day;
		int k;
		int cnt = 0;
		int s = 0;
		char[][] a = new char[200][200];
		char[][] b = new char[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a [i][j];
			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < day; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						if (a [i - 1][j] != '#')
						{
							b[i - 1][j] = '@';
						}
						if (a [i][j + 1] != '#')
						{
							b[i][j + 1] = '@';
						}
						if (a [i][j - 1] != '#')
						{
							b[i][j - 1] = '@';
						}
						if (a [i + 1][j] != '#')
						{
							b[i + 1][j] = '@';
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
					for (j = 1; j <= n; j++)
					{
						a[i][j] = b[i][j];
					}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					cnt++;
				}

			}
		}
		System.out.print(cnt);
		return 0;
	}
}

