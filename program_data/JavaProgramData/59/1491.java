package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int n;
		int i;
		int j;
		int m;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2;k <= m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						if (i != 0 && a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
						if (i != n - 1 && a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
						if (j != 0 && a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
						if (j != n - 1 && a[i][j + 1] == '.')
						{
							b[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b[i][j] == '@')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
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

