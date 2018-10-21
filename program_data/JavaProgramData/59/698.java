package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int day;
		int m;
		int count = 0;
		int[][] b = new int[101][101];
		char[][] a =
		{
			{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					b[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (day = 1; day < m; day++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (b[i][j] == 1)
					{
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '@';
						}
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '@';
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '@';
						}
					}
				}
			}
		   for (i = 0; i < n; i++)
		   {
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '@')
					{
						b[i][j] = 1;
					}
				}
		   }
		}
		for (i = 0; i < n; i++)
		{
				for (j = 0; j < n; j++)
				{
					if (b[i][j] == 1)
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

