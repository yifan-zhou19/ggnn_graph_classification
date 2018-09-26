package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[][] b = new int[101][101];
		int k;
		int s = 0;
		char[][] a = new char[101][101];
		for (i = 0;i <= 100;i++)
		{
			for (j = 0;j <= 100;j++)
			{
				a[i][j] = '#';
				b[i][j] = 0;
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= m - 1;k++)
		{

			for (i = 0;i <= 100;i++)
			{
			for (j = 0;j <= 100;j++)
			{
				if (a[i][j] == '@')
				{
					b[i][j] = 1;
				}

			}
			}

			for (i = 0;i <= 100;i++)
			{
			for (j = 0;j <= 100;j++)
			{
				if (b[i][j] == 1)
				{
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = '@';
					}

					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = '@';
					}
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = '@';
					}
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = '@';
					}
					b[i][j] = 0;
				}

			}
			}
		}
		s = 0;
	for (i = 0;i <= 100;i++)
	{
			for (j = 0;j <= 100;j++)
			{
				if (a[i][j] == '@')
				{
					s++;
				}

			}
	}
	System.out.print(s);
		return 0;
	}
}

