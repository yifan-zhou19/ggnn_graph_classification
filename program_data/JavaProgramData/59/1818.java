package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int d;
		int count = 0;
		char[][][] s = new char[101][101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				s[i][j][1] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 1;d <= m - 1;d++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					s[i][j][d + 1] = s[i][j][d];
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (s[i][j][d] == '@')
					{
						if (s[i + 1][j][d] == '.')
						{
							s[i + 1][j][d + 1] = '@';
						}
						if (s[i - 1][j][d] == '.')
						{
							s[i - 1][j][d + 1] = '@';
						}
						if (s[i][j + 1][d] == '.')
						{
							s[i][j + 1][d + 1] = '@';
						}
						if (s[i][j - 1][d] == '.')
						{
							s[i][j - 1][d + 1] = '@';
						}
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j][m] == '@')
				{
					count += 1;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

