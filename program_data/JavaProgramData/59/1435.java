package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[101][101];
	int i;
	int j;
	int n;
	int ans;
	int m;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (m > 1)
	{
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
			if (a[i][j] == '@')
			{
				if ((i > 1) && (a[i - 1][j] == '.'))
				{
					a[i - 1][j] = '1';
				}
			if ((i < n) && (a[i + 1][j] == '.'))
			{
				a[i + 1][j] = '1';
			}
			if ((j > 1) && (a[i][j - 1] == '.'))
			{
				a[i][j - 1] = '1';
			}
			if ((j < n) && (a[i][j + 1] == '.'))
			{
				a[i][j + 1] = '1';
			}
			}
		}
		}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (a[i][j] == '1')
			{
				a[i][j] = '@';
			}
		}
	}
		m--;
	}
	ans = 0;
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (a[i][j] == '@')
			{
				ans++;
			}
		}
	}
	System.out.print(ans);
			 return 0;
	}
}

