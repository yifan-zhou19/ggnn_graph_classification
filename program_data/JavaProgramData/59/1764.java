package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		char[][] b = new char[102][102];
		int n;
		int m;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (; m > 1 ; m--)
		{
			for (i = 1 ; i <= n ; i++)
			{
				for (j = 1 ; j <= n ; j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
						if (a[i][j + 1] == '.')
						{
							b[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 1 ; i <= n ; i++)
			{
				for (j = 1 ; j <= n ; j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		k = 0;
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				if (a[i][j] == '@')
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

