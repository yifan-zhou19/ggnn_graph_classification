package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int s = 0;
		int k;
		char[][] room = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= m - 1;k++)
		{
			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					if (room[i][j] == '@')
					{
						if (i > 0 && room[i - 1][j] == '.')
						{
							room[i - 1][j] = '*';
						}
						if (i < n - 1 && room[i + 1][j] == '.')
						{
							room[i + 1][j] = '*';
						}
						if (j > 0 && room[i][j - 1] == '.')
						{
							room[i][j - 1] = '*';
						}
						if (j < n - 1 && room[i][j + 1] == '.')
						{
							room[i][j + 1] = '*';
						}
					}
				}
			}
			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					if (room[i][j] == '*')
					{
						room[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (room[i][j] == '@')
				{
					s += 1;
				}
			}
		}
		System.out.print(s);
		return 0;
	}
}

