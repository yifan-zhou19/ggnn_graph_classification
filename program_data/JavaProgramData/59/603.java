package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] room = new char[101][101];

		int i;
		int j;
		int t;
		int n;
		int m;
		int count;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			room[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (t = 2; t <= m; t++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (room[i][j] == '@')
					{
						if (i != 0 && room[i - 1][j] == '.')
						{
							room[i - 1][j] = 'a';
						}
						if ((i != n - 1) && room[i + 1][j] == '.')
						{
							room[i + 1][j] = 'a';
						}
						if (j != 0 && room[i][j - 1] == '.')
						{
							room[i][j - 1] = 'a';
						}
						if ((j != n - 1) && room[i][j + 1] == '.')
						{
							room[i][j + 1] = 'a';
						}
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (room[i][j] == 'a')
					{
						room[i][j] = '@';
					}
				}
			}
		}


		count = 0;

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (room[i][j] == '@')
				{
					count++;
				}
			}
		}

		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

