package <missing>;

public class GlobalMembers
{
	public static char[][] room = new char[100][100];
	public static int n;
	public static void dg(int m) //???m?
	{
		if (m > 1)
		{
			dg(m - 1); //?????????
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (room[i][j] == '@') //??
					{
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '*';
						}
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '*';
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '*';
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '*';
						}
					}
				}
			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (room[i][j] == '*')
					{
						room[i][j] = '@'; //??????????
					}
				}
			}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dg(m);
		int p = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (room[i][j] == '@') //????????
				{
					p++;
				}
			}
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

