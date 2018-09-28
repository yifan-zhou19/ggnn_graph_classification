package <missing>;

public class GlobalMembers
{
	public static char[][] room = new char[102][102];
	public static char[][] temp = new char[102][102];
	public static int n;

	public static void test()
	{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				temp[i][j] = room[i][j];
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (room[i][j] == '@')
				{
					if (room[i - 1][j] == '.')
					{
						temp[i - 1][j] = '@';
					}
					if (room[i + 1][j] == '.')
					{
						temp[i + 1][j] = '@';
					}
					if (room[i][j - 1] == '.')
					{
						temp[i][j - 1] = '@';
					}
					if (room[i][j + 1] == '.')
					{
						temp[i][j + 1] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				room[i][j] = temp[i][j];
			}
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= m;i++)
		{
			test();
		}

		int counter = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (room[i][j] == '@')
				{
					counter++;
				}
			}
		}
		System.out.print(counter);
		return 0;
	}

}

