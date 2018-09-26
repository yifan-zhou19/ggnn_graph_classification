package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] s = new char[200][200];
	int n;
	int m;
	int i;
	int j;
	int t;
	int p;
	int[][] a = new int[200][200];
	p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n + 1;i++)
	{
		for (j = 0;j <= n + 1;j++)
		{
			a[i][j] = 0;
		}
	}
	for (i = 0;i <= n + 1;i++)
	{
		s[0][i] = '#';
		s[n + 1][i] = '#';
		s[i][0] = '#';
		s[i][n + 1] = '#';
	}
	for (i = 1;i < n + 1;i++)
	{
		for (j = 1;j < n + 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ", 1);
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
	for (t = 2;t <= m;t++)
	{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] == '.' && ((s[i - 1][j] == '@' && a[i - 1][j] < (t - 1)) || (s[i][j - 1] == '@' && a[i][j - 1] < (t - 1)) || (s[i][j + 1] == '@' && a[i][j + 1] < (t - 1)) || (s[i + 1][j] == '@' && a[i + 1][j] < (t - 1))))
				{
					s[i][j] = '@';
					a[i][j] = t - 1;
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
				p = p + 1;
			}
		}
	}
	System.out.printf("%d",p);
	return 0;
	}
}

