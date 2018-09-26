package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int l;
		int t;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l < m - 1;l++)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					b[i][j] = a[i][j];
				}
			}
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if (b[i][j] == '@')
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
		}
		t = 0;
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (a[i][j] == '@')
				{
					t++;
				}
			}
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

