package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		char[][] s = new char[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
		}
		int m;
		int r;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m > 1)
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					for (r = 0;r < n;r++)
					{
						if (s[j][r] == '*')
						{
							s[j][r] = '@';
						}
					}
				}
				for (j = 0;j < n;j++)
				{
					for (r = 0;r < n;r++)
					{
						if (s[j][r] == '@')
						{
							if (j != 0 && s[j - 1][r] == '.')
							{
								s[j - 1][r] = '*';
							}
							if (j != n - 1 && s[j + 1][r] == '.')
							{
								s[j + 1][r] = '*';
							}
							if (r != n - 1 && s[j][r + 1] == '.')
							{
								s[j][r + 1] = '*';
							}
							if (r != 0 && s[j][r - 1] == '.')
							{
								s[j][r - 1] = '*';
							}
						}
					}
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (r = 0;r < n;r++)
			{
				if (s[j][r] == '@')
				{
					count++;
				}
			}
		}
		System.out.printf("%d",count);
		return 0;
	}
}

