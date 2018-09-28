package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[105][105];
		int n;
		int m;
		int i;
		int j;
		int k;
		int num = 0;
		for (i = 1;i < 105;i++)
		{
				for (j = 1;j < 105;j++)
				{
					a[i][j] = 'A';
				}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m - 1 ;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] != '@' && a[i - 1][j] != '#' && a[i - 1][j] != 'A' && a[i - 1][j] == '.')
						{
							a[i - 1][j] = 'a';
							num++;
						}
						if (a[i + 1][j] != '@' && a[i + 1][j] != '#' && a[i + 1][j] != 'A' && a[i + 1][j] == '.')
						{
							a[i + 1][j] = 'a';
							num++;
						}
						if (a[i][j - 1] != '@' && a[i][j - 1] != '#' && a[i][j - 1] != 'A' && a[i][j - 1] == '.')
						{
							a[i][j - 1] = 'a';
							num++;
						}
						if (a[i][j + 1] != '@' && a[i][j + 1] != '#' && a[i][j + 1] != 'A' && a[i][j + 1] == '.')
						{
							a[i][j + 1] = 'a';
							num++;
						}
					}
				}
			}
					for (i = 1;i <= n;i++)
					{
						for (j = 1;j <= n;j++)
						{
							if (a[i][j] == 'a')
							{
								a[i][j] = '@';
							}
						}
					}
		}
								System.out.print(num);
								System.out.print("\n");

			return 0;
	}

}

