package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] room = new char[100][100];
		int n;
		int m;
		int number = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1; k < m; k++)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (room[i][j] == '@')
					{
						if (i != 0)
						{
							if (room[i - 1][j] == '.')
							{
								room[i - 1][j] = '!';
							}
						}
						if (i != n - 1)
						{
							if (room[i + 1][j] == '.')
							{
								room[i + 1][j] = '!';
							}
						}
						if (j != 0)
						{
							if (room[i][j - 1] == '.')
							{
								room[i][j - 1] = '!';
							}
						}
						if (j != n - 1)
						{
							if (room[i][j + 1] == '.')
							{
								room[i][j + 1] = '!';
							}
						}
					}
				}
			}
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (room[i][j] == '!')
					{
						room[i][j] = '@';
					}
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (room[i][j] == '@')
				{
					number++;
				}
			}
		}
		System.out.print(number);

		return 0;
	}
}

