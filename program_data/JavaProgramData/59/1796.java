package <missing>;

public class GlobalMembers
{
	public static void chuanran(String[] a, int n)
	{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j].equals('@'))
				{
					if (a[i][j + 1].equals('.'))
					{
						a[i][j + 1] = 'A';
					}
					if (a[i][j - 1].equals('.'))
					{
						a[i][j - 1] = 'A';
					}
					if (a[i + 1][j].equals('.'))
					{
						a[i + 1][j] = 'A';
					}
					if (a[i - 1][j].equals('.'))
					{
						a[i - 1][j] = 'A';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j].equals('A'))
				{
					a[i][j] = '@';
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[110][110];
		int i;
		int j;
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				if (i == 0 || j == 0 || i == n + 1 || j == n + 1)
				{
					a[i][j] = '#';
					continue;
				}
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m-- != 0)
		{
			chuanran(a, n);
		}
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}

}

