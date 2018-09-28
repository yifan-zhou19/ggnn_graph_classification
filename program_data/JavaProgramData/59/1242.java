package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int result = 0;
		char[][] s = new char[101][101];
		char[][] s1 = new char[101][101];
		char[][] s2 = new char[101][101];
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
					s[i] = tempVar2.charAt(0);
				}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				s1[i + 1][j + 1] = s[i][j];
				s2[i][j] = s[i][j];
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				if (i == 0 || i == n + 1 || j == 0 || j == n + 1)
				{
					s1[i][j] = '#';
				}
			}
		}
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (s1[i][j] == '@')
					{
						s2[i - 1][j - 1] = '@';
						if (s1[i - 1][j] != '#')
						{
							s2[i - 2][j - 1] = '@';
						}
						if (s1[i + 1][j] != '#')
						{
							s2[i][j - 1] = '@';
						}
						if (s1[i][j - 1] != '#')
						{
							s2[i - 1][j - 2] = '@';
						}
						if (s1[i][j + 1] != '#')
						{
							s2[i - 1][j] = '@';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s2[i][j] == '@')
					{
						s1[i + 1][j + 1] = s2[i][j];
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s2[i][j] == '@')
				{
					result++;
				}
			}
		}
		System.out.printf("%d",result);
		return 0;
	}
}

