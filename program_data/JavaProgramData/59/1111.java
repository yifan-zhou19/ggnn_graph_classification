package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[101][101];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		int q;
		int w;
		int[] c = new int[10000];
		int[] b = new int[10000];
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		int j;
		for (i = 1;i < p;i++)
		{
			w = 0;
			for (t = 0;t < n;t++)
			{
				for (q = 0;q < n;q++)
				{
					if (a[t][q] == '@')
					{
						c[w] = t;
						b[w] = q;
						w++;
					}
				}
			}
			for (j = 0;j < w;j++)
			{
				if (a[c[j] + 1][b[j]] != '#' && c[j] + 1 < n)
				{
					a[c[j] + 1][b[j]] = '@';
				}
				if (a[c[j]][b[j] + 1] != '#' && b[j] + 1 < n)
				{
					a[c[j]][b[j] + 1] = '@';
				}
				if (a[c[j] - 1][b[j]] != '#' && c[j] - 1 >= 0)
				{
					a[c[j] - 1][b[j]] = '@';
				}
				if (a[c[j]][b[j] - 1] != '#' && b[j] - 1 >= 0)
				{
					a[c[j]][b[j] - 1] = '@';
				}
			}
		}
		int y = 0;
		for (i = 0;i < n;i++)
		{
			for (t = 0;t < n;t++)
			{
				if (a[i][t] == '@')
				{
					y++;
				}
			}
		}
		System.out.printf("%d",y);
		return 0;
	}

}

