package <missing>;

public class GlobalMembers
{
	public static int n;
	public static char[][] a = new char[100][100];
	public static char[][] b = new char[100][100];
	public static void infect()
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					if (a[i + 1][j] == '.' && i + 1 < n)
					{
						b[i + 1][j] = '@';
					}
					if (a[i - 1][j] == '.' && i - 1 >= 0)
					{
						b[i - 1][j] = '@';
					}
					if (a[i][j + 1] == '.' && j + 1 < n)
					{
						b[i][j + 1] = '@';
					}
					if (a[i][j - 1] == '.' && j - 1 >= 0)
					{
						b[i][j - 1] = '@';
					}
				}
			}
		}
	}
	public static int Main()
	{
		int m;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i < m;i++)
		{
			infect();
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
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

