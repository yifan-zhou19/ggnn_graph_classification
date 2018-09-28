package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int victim = 0;
		char[][] a = new char[101][101];
		char[][] b = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (k = 1;k <= n;k++)
			{
				a[i][k] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j < m;j++)
		{
			for (i = 1;i <= n;i++)
			{
			for (k = 1;k <= n;k++)
			{
				if (a[i][k] == '@')
				{
					b[i][k] = a[i][k];
				}
			}
			}
			for (i = 1;i <= n;i++)
			{
			for (k = 1;k <= n;k++)
			{
				if (b[i][k] == '@')
				{
					if (a[i - 1][k] == '.')
					{
						a[i - 1][k] = '@';
					}
					if (a[i][k - 1] == '.')
					{
						a[i][k - 1] = '@';
					}
					if (a[i][k + 1] == '.')
					{
						a[i][k + 1] = '@';
					}
					if (a[i + 1][k] == '.')
					{
						a[i + 1][k] = '@';
					}
				}
			}
			}
		}
			for (i = 1;i <= n;i++)
			{
			for (k = 1;k <= n;k++)
			{
				if (a[i][k] == '@')
				{
					victim++;
				}
			}
			}
			System.out.print(victim);
			return 0;
	}
}

