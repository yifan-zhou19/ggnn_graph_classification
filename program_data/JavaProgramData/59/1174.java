package <missing>;

public class GlobalMembers
{
	public static char[][][] a = new char[103][200][200];
	public static int Main()
	{
		int n;
		int m;
		int day = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[1][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > day)
		{
			day++;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (a[day - 1][i][j] == '#')
					{
						a[day][i][j] = '#';
					}
					else if (a[day - 1][i][j] == '@' || i > 0 && a[day - 1][i - 1][j] == '@' || i < n - 1 && a[day - 1][i + 1][j] == '@' || j>0 && a[day - 1][i][j - 1] == '@' || j < n - 1 && a[day - 1][i][j + 1] == '@')
					{
						a[day][i][j] = '@';
					}
					else
					{
						a[day][i][j] = '.';
					}
				}
			}
		}
		int count = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (a[m][i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

