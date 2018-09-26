package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[100][100];
	public static int Main()
	{
		int n;
		int m;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k < m;k++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
					if (i > 0 && a[i - 1][j] == '.')
					{
						a[i - 1][j] = '*';
					}
					if (j > 0 && a[i][j - 1] == '.')
					{
						a[i][j - 1] = '*';
					}
					if (i < n - 1 && a[i + 1][j] == '.')
					{
						a[i + 1][j] = '*';
					}
					if (j < n - 1 && a[i][j + 1] == '.')
					{
						a[i][j + 1] = '*';
					}
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
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

