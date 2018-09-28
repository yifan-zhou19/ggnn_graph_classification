package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] room = new char[100][100];
		int i;
		int j;
		int k;
		int n;
		int m;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
		for (j = 0; j < n; j++)
		{
		room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		}


		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 2; k <= m; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (room[i][j] == '@')
					{
						if (room[i][j + 1] == '.' && j != n - 1)
						{
							room[i][j + 1] = '$';
						}
						if (room[i][j - 1] == '.' && j != 0)
						{
							room[i][j - 1] = '$';
						}
						if (room[i + 1][j] == '.' && i != n - 1)
						{
							room[i + 1][j] = '$';
						}
						if (room[i - 1][j] == '.' && i != 0)
						{
							room[i - 1][j] = '$';
						}
					}
				}
			}

			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (room[i][j] == '$')
					{
						room[i][j] = '@';
					}
				}
			}
		}

		k = 0;
		for (i = 0; i < n; i++)
		{
		for (j = 0; j < n; j++)
		{
			if (room[i][j] == '@')
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

