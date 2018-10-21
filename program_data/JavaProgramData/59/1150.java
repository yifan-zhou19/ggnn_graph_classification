package <missing>;

public class GlobalMembers
{
	public static char flu(char a)
	{
		if (a == '.')
		{
			return '!';
		}
		else
		{
			return a;
		}
	} //????
	public static int change(String[] a, int m, int n)
	{
		if (m > 1)
		{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j].equals('@'))
				{
					 a[i][j + 1] = flu(a[i][j + 1]);
						 a[i][j - 1] = flu(a[i][j - 1]);
						 a[i + 1][j] = flu(a[i + 1][j]);
						 a[i - 1][j] = flu(a[i - 1][j]);
				} //??????????
			}
		}
		int x;
		int y;
		for (x = 1;x <= n;x++)
		{
			for (y = 1;y <= n;y++)
			{
				if (a[x][y].equals('!'))
				{
					a[x][y] = '@';
				} //?????????????
			}
		}
		}
		if (m == 1)
		{
			return 0;
		}
		change(a, m - 1, n); //?????
	}
	public static int Main()
	{
		int room;
		int i;
		int j;
		int m;
		int s = 0;
		final String a = "";
		room = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= room;i++)
		{
			for (j = 1;j <= room;j++)
			{
				a.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		change(a, m, room);
		for (i = 1;i <= room;i++)
		{
			for (j = 1;j <= room;j++)
			{
				if (a.charAt(i)[j] == '@')
				{
					s++;
				}
			}
		} //????
		System.out.print(s);
		return 0;
	}

}

