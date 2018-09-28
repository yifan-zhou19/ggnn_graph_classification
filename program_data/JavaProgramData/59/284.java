package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int count = 0;
		int x;
		int y;
		int m;
		char[][] area = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				area[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < m - 1; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (area[i][j] == '@')
					{
						x = i;
						y = j;
						if ((y - 1 >= 0) && (area[x][y - 1] == '.'))
						{
							area[x][y - 1] = '*';
						}
						if ((y + 1 < n) && (area[x][y + 1] == '.'))
						{
							area[x][y + 1] = '*';
						}
						if ((x - 1 >= 0) && (area[x - 1][y] == '.'))
						{
							area[x - 1][y] = '*';
						}
						if ((x + 1 < n) && (area[x + 1][y] == '.'))
						{
							area[x + 1][y] = '*';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (area[i][j] == '*')
					{
						area[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (area[i][j] == '@')
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

