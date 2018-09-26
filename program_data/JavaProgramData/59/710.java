package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int num = 0;
		char[][] h = new char[100][100];
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				h[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < m - 1 ; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (h[i][j] == '@')
					{
						if ((h[i][j + 1] == '.') && j != n - 1)
						{
							h[i][j + 1] = '*';
						}
						if ((h[i][j - 1] == '.') && j != 0)
						{
							h[i][j - 1] = '*';
						}
						if ((h[i + 1][j] == '.') && i != n - 1)
						{
							h[i + 1][j] = '*';
						}
						if ((h[i - 1][j] == '.') && i != 0)
						{
							h[i - 1][j] = '*';
						}
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (h[i][j] == '*')
					{
						h[i][j] = '@';
					}
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				 if (h[i][j] == '@')
				 {
					 num++;
				 }
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

