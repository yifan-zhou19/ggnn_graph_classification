package <missing>;

public class GlobalMembers
{
	/*??? 1200012866 11.11*/
	public static int Main()
	{
		int n;
		int count = 0;
		int m;
		char[][] a = new char[105][105];
		char[][] b = new char[105][105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0;z < m - 1;z++)
		{ //m-1?
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++) //??
				{
					if (a[i][j] == '@')
					{
						if (i > 0 && a[i - 1][j] != '#')
						{
							b[i - 1][j] = '@';
						}
						if (j > 0 && a[i][j - 1] != '#')
						{
							b[i][j - 1] = '@';
						}
						if (i < n - 1 && a[i + 1][j] != '#')
						{
							b[i + 1][j] = '@';
						}
						if (j < n - 1 && a[i][j + 1] != '#')
						{
							b[i][j + 1] = '@';
						}
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++) //????
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (int i = 0;i < n;i++) //??
		{
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
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

