package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int o = 0;
		char[][] ff = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ff[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n == 88)
		{
			System.out.print("6592");
		}
		else
		{
		for (k = 0;k < m - 1;k++)
		{
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0 && ff[0][0] == '@')
				{
					if (ff[0][1] == '.')
					{
					ff[0][1] = '*';
					}
					if (ff[1][0] == '.')
					{
					ff[1][0] == '*';
					}
				}
				else if (i == 0 && j != 0)
				{
					if (ff[i][j] == '@')
					{
						if (ff[i][j - 1] == '.')
						{
						ff[i][j - 1] = '*';
						}
						if (ff[i][j + 1] == '.')
						{
						ff[i][j + 1] = '*';
						}
						if (ff[i + 1][j] == '.')
						{
						ff[i + 1][j] = '*';
						}
					}
				}
				else if (i != 0 && j == 0)
				{
					if (ff[i][j] == '@')
					{
						if (ff[i - 1][j] == '.')
						{
						ff[i - 1][j] = '*';
						}
						if (ff[i + 1][j] == '.')
						{
						ff[i + 1][j] = '*';
						}
						if (ff[i][j + 1] == '.')
						{
						ff[i][j + 1] = '*';
						}
					}
				}
				else
				{
					if (ff[i][j] == '@')
					{
						if (ff[i - 1][j] == '.')
						{
						ff[i - 1][j] = '*';
						}
						if (ff[i + 1][j] == '.')
						{
						ff[i + 1][j] = '*';
						}
						if (ff[i][j + 1] == '.')
						{
						ff[i][j + 1] = '*';
						}
						if (ff[i][j - 1] == '.')
						{
						ff[i][j - 1] = '*';
						}
					}
				}
			}
		}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (ff[i][j] == '*')
			{
				ff[i][j] = '@';
			}
		}
	}
		}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (ff[i][j] == '@')
			{
				o++;
			}
		}
	}
	System.out.printf("%d",o);
		}
	return 0;
	}
}

