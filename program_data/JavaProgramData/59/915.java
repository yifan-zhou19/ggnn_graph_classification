package <missing>;

public class GlobalMembers
{
	/*1200012866 ??? 11.29*/
	public static char[][] a = new char[110][110];
	public static int ganran(int day,int m,int n)
	{
		if (day == m)
		{ //???m?
			int count = 0;
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] == '@' || a[i][j] == 'a')
					{
						count++;
					}
				}
			}
			return count;
		}
		else
		{
			for (int i = 1;i <= n;i++) //??
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = 'a';
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = 'a';
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = 'a';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = 'a';
						}
					}
				}
			}
			for (int i = 1;i <= n;i++) //???????????????????
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] == 'a')
					{
						a[i][j] = '@';
					}
				}
			}
			return ganran(day + 1, m, n);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(ganran(1, m, n));
		System.out.print("\n");

		return 0;
	}
}

