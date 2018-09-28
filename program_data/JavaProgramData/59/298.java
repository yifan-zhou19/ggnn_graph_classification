package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int count = 0;
		char[][] a = new char[101][101];
		char[][] b = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n + 2; i++)
		{
			for (j = 0 ; j < n + 2; j++)
			{
				a[i][j] = '#';
				b[i][j] = '#';
			}
		}
		for (i = 1 ; i <= n; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0 ; k < m - 1 ; k++)
		{
			for (i = 1 ; i <= n ; i++)
			{
				for (j = 1 ; j <= n ; j++)
				{
					if (b[i][j] == '@' && b[i + 1][j] == '.')
					{
						a[i + 1][j] = '@';
					}
					if (b[i][j] == '@' && b[i - 1][j] == '.')
					{
						a[i - 1][j] = '@';
					}
					if (b[i][j] == '@' && b[i][j + 1] == '.')
					{
						a[i][j + 1] = '@';
					}
					if (b[i][j] == '@' && b[i][j - 1] == '.')
					{
						a[i][j - 1] = '@';
					}
				}
			}
			for (i = 0 ; i < n + 2; i++)
			{
				for (j = 0 ; j < n + 2; j++)
				{
					b[i][j] = a[i][j];
				}
			}
		}
		for (i = 1 ; i <= n; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}


}

