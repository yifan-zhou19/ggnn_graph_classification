package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int sum = 0;
		char[][] s = new char[110][110];
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				scanf("\n");
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					s[i][j] = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] == '@')
				{
					if (s[i + 1][j] != '#' && s[i + 1][j] != '@')
					{
						 s[i + 1][j] = '!';
					}
					if (s[i - 1][j] != '#' && s[i - 1][j] != '@')
					{
						 s[i - 1][j] = '!';
					}
					if (s[i][j + 1] != '#' && s[i][j + 1] != '@')
					{
						 s[i][j + 1] = '!';
					}
					if (s[i][j - 1] != '#' && s[i][j - 1] != '@')
					{
						 s[i][j - 1] = '!';
					}
				}
			}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (s[i][j] == '!')
					{
						s[i][j] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}



}

