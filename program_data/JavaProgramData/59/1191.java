package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		char[][] a = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						if (j + 1 < n && a[i][j + 1] == '.')
						{
							a[i][j + 1] = '$';
						}
						if (i + 1 < n && a[i + 1][j] == '.')
						{
							a[i + 1][j] = '$';
						}
						if (j - 1 >= 0 && a[i][j - 1] == '.')
						{
							a[i][j - 1] = '$';
						}
						if (i - 1 >= 0 && a[i - 1][j] == '.')
						{
							a[i - 1][j] = '$';
						}

					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '$')
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
					t++;
				}
			}
		}
		System.out.print(t);
		return 0;
	}
}

