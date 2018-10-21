package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] ren1 = new char[102][102];
		char[][] ren2 = new char[102][102];
		for (i = 0;i <= 101;i++)
		{
			for (j = 0;j <= 101;j++)
			{
				ren1[i][j] = '\0';
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				ren1[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (i = 0;i <= 101;i++)
		{
			for (j = 0;j <= 101;j++)
			{
				ren2[i][j] = ren1[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 1)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (ren1[i][j] == '@')
					{
						if (ren1[i - 1][j] == '.')
						{
							ren2[i - 1][j] = '@';
						}
						if (ren1[i + 1][j] == '.')
						{
							ren2[i + 1][j] = '@';
						}
						if (ren1[i][j - 1] == '.')
						{
							ren2[i][j - 1] = '@';
						}
						if (ren1[i][j + 1] == '.')
						{
							ren2[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					ren1[i][j] = ren2[i][j];
				}
			}
			m--;
		}
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
					if (ren2[i][j] == '@')
					{
						s++;
					}
				}
		}
		System.out.print(s);
		return 0;
	}
}

