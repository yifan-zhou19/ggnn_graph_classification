package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int b;
		int c;
		int d;
		int e;
		int p;
		int q;
		int u;
		int v;
		char[][] a = new char[100][100];
		char[][] x = new char[100][100];
		int sum = 0;
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
				a[i] = tempVar2.charAt(0);
			}
			strcmp(x[i],a[i]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 1;k < m;k++)
		{
			for (b = 0;b < n;b++)
			{
				for (c = 0;c < n;c++)
				{
					if (a[b][c] == '@')
					{
						if (b > 0)
						{
							if (!(a[b - 1][c] == '#'))
							{
								x[b - 1][c] = '@';
							}
						}
						if (b + 1 < n)
						{
							if (!(a[b + 1][c] == '#'))
							{
							x[b + 1][c] = '@';
							}
						}
						if (c > 0)
						{
							if (!(a[b][c - 1] == '#'))
							{
							x[b][c - 1] = '@';
							}
						}
						if (c + 1 < n)
						{
							if (!(a[b][c + 1] == '#'))
							{
							x[b][c + 1] = '@';
							}
						}
					}
				}
			}
			for (u = 0;u < n;u++)
			{
				for (v = 0;v < n;v++)
				{
					if (x[u][v] == '@')
					{
					a[u][v] = x[u][v];
					}
				}
			}
		}
		sum = 0;
		for (d = 0;d < n;d++)
		{
			for (e = 0;e < n;e++)
			{
				if (a[d][e] == '@')
				{
					sum++;
				}
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

