package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int N;
		int n;
		int o;
		int i;
		int j;
		int r;
		int[][] a = new int[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (N = 1;N <= n;N++)
		{
		r = 0;
	for (i = 0;i <= n - 1;i++)
	{
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
		}
	}
		for (m = 0;m <= n - 2;m++)
		{
		for (i = 0;i <= n - 1;i++)
		{
			{
				if ((i >= 1) && (i <= m))
				{
					i = m;
					continue;
				}
		}
			o = a[i][0];
			for (j = 1;j <= n - 1;j++)
			{
				{
					if ((j >= 1) && (j <= m))
					{
						j = m;
						continue;
					}
			}
				o = (o <= a[i][j])?o:a[i][j];
			}
			for (j = 0;j <= n - 1;j++)
			{
				{
					if ((j >= 1) && (j <= m))
					{
						j = m;
						continue;
					}
			}
				a[i][j] = a[i][j] - o;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			{
				if ((j >= 1) && (j <= m))
				{
					j = m;
					continue;
				}
		}
			o = a[0][j];
			for (i = 1;i <= n - 1;i++)
			{
				{
					if ((i >= 1) && (i <= m))
					{
						i = m;
						continue;
					}
			}
				o = (o <= a[i][j])?o:a[i][j];
			}
			for (i = 0;i <= n - 1;i++)
			{
				{
					if ((i >= 1) && (i <= m))
					{
						i = m;
						continue;
					}
			}
				a[i][j] = a[i][j] - o;
			}
		}
	r = r + a[1 + m][1 + m];
		}
	System.out.printf("%d\n",r);
		}

	}

}

