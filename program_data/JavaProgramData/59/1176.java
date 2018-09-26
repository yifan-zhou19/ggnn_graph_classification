package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] room = new char[100][100];
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		for (k = 2; k <= m; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (room[i][j] == '@')
					{
						if (j + 1 < n && room[i][j + 1] == '.')
						{
							room[i][j + 1] = '?';
						}
						if (j - 1 >= 0 && room[i][j - 1] == '.')
						{
							room[i][j - 1] = '?';
						}
						if (i + 1 < n && room[i + 1][j] == '.')
						{
							room[i + 1][j] = '?';
						}
						if (i - 1 >= 0 && room[i - 1][j] == '.')
						{
							room[i - 1][j] = '?';
						}
					}
				}
			}
					for (i = 0; i < n; i++)
					{
						for (j = 0; j < n; j++)
						{
							if (room[i][j] == '?')
							{
								room[i][j] = '@';
							}
						}
					}
		}
		int count = 0;
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

