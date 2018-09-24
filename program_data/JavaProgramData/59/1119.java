package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] room = new char[101][101];
		int n;
		int m;
		int sum = 0;
		int i;
		int j;
		int k;
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;m > 1;m--)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (room[i][j] == '@')
					{
						for (k = 0;k < 4;k++)
						{
							if (room[i + dx[k]][j + dy[k]] == '.')
							{
								room[i + dx[k]][j + dy[k]] = '!';
							}
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (room[i][j] == '!')
					{
						room[i][j] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (room[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}

}

