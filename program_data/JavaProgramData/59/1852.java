package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int i;
		int s = 0;
		char[][] p = new char[200][200];
		char[][] q = new char[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a < n + 1;a++)
		{
			for (b = 1;b < n + 1;b++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar2 != null)
				{
					p[a][b] = tempVar2.charAt(0);
				}
				q[a][b] = p[a][b];
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n + 2;i++)
		{
			p[0][i] = '#';
			p[n + 1][i] = '#';
			p[i][0] = '#';
			p[i][n + 1] = '#';
		}
		for (i = 1;i < m;i++)
		{
			for (a = 1;a < n + 1;a++)
			{
				for (b = 1;b < n + 1;b++)
				{
					if (p[a][b] != '#')
					{
					if (p[a - 1][b] == '@' || p[a + 1][b] == '@' || p[a][b - 1] == '@' || p[a][b + 1] == '@')
					{
						q[a][b] = '@';
					}
					}
				}
			}
			for (a = 1;a < n + 1;a++)
			{
				for (b = 1;b < n + 1;b++)
				{
					p[a][b] = q[a][b];
				}
			}
		}
		for (a = 1;a < n + 1;a++)
		{
			for (b = 1;b < n + 1;b++)
			{
				if (p[a][b] == '@')
				{
					s = s + 1;
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

