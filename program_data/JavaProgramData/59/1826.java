package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int n;
		int m;
		int i;
		int j;
		char[][] a = new char[110][110];
		char[][] b = new char[110][110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;++i)
		{
			for (j = 0;j <= n - 1;++j)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for ((m;m >= 2;--m = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i <= n - 1;++i)
			{
				for (j = 0;j <= n - 1;++j)
				{
					b[i][j] = a[i][j];
				}
			}
			for (i = 0;i <= n - 1;++i)
			{
				for (j = 0;j <= n - 1;++j)
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
			for (i = 0;i <= n - 1;++i)
			{
				for (j = 0;j <= n - 1;++j)
				{
					if (b[i][j] == '@')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i <= n - 1;++i)
		{
			for (j = 0;j <= n - 1;++j)
			{
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}



}

