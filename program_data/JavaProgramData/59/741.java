package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[101][101]; //???????
		int i; //i?j??????s??????n??????m???
		int j;
		int n;
		int m;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		} //????
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 0)
		{ //?????0????????
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
			} //??????????????????????
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] == '.' && i > 1)
						{
							a[i - 1][j] = '*';
						}
						if (a[i + 1][j] == '.' && i < n)
						{
							a[i + 1][j] = '*';
						}
						if (a[i][j - 1] == '.' && j > 1)
						{
							a[i][j - 1] = '*';
						}
						if (a[i][j + 1] == '.' && j < n)
						{
							a[i][j + 1] = '*';
						}
					} //????????????????????????
				}
			}
			m--;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					s = s + 1;
				}
			}
		} //??s??????
		System.out.print(s);
		return 0;
	} //?????

}

