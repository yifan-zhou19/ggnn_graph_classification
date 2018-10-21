package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[110][110];
	public static void f(int n)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[i][j] == 1)
				{
					if (i > 0 && a[i - 1][j] == 0)
					{
						a[i - 1][j] = 1;
					}
					if (i < n - 1 && a[i + 1][j] == 0)
					{
						a[i + 1][j] = 2;
					}
					if (j > 0 && a[i][j - 1] == 0)
					{
						a[i][j - 1] = 1;
					}
					if (j < n - 1 && a[i][j + 1] == 0)
					{
						a[i][j + 1] = 2;
					}
				}
				if (a[i][j] == 2)
				{
					a[i][j] = 1;
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int sum = 0;
		char s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			System.in.read();
			for (j = 0; j < n; j++)
			{
				cin.get(s);
				if (s == '#')
				{
					a[i][j] = -1;
				}
				if (s == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < m; i++)
		{
			f(n);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[i][j] == 1)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

