package <missing>;

public class GlobalMembers
{
	public static int rt1(int x, int y)
	{
		sz[q][p] = sr[q][p];
		sc[count] = sz[q][p];
		p = x + 1;
		q = y;
		if (sz[q][p] > 0)
		{
				flag = flag + 1;
				p = p - 1;
				q = q + 1;
		}

		return (p,q);
	}
	public static int rt2(int x, int y)
	{
		sz[q][p] = sr[q][p];
		sc[count] = sz[q][p];
		p = x;
		q = y + 1;
		if (sz[q][p] > 0)
		{
				flag = flag + 1;
				q = q - 1;
				p = p - 1;
		}


		return (p,q);

	}
	public static int rt3(int x, int y)
	{
		sz[q][p] = sr[q][p];
		sc[count] = sz[q][p];
		p = x - 1;
		q = y;
		if (sz[q][p] > 0)
		{
				flag = flag + 1;
				p = p + 1;
				q = q - 1;
		}

		return (p,q);
	}
	public static int rt4(int x, int y)
	{
			sz[q][p] = sr[q][p];
			sc[count] = sz[q][p];
		p = x;
		q = y - 1;
		if (sz[q][p] > 0)
		{
				flag = flag + 1;
				q = q + 1;
				p = p + 1;
		}

		return (p,q);
	}
	public static int[][] sz = new int[100][100];
	public static int[][] sr = new int[100][100];
	public static int[] sc = new int[10000];
	public static int p = 0;
	public static int q = 0;
	public static int count = 0;
	public static int flag = 1;
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				sz[i][j] = 1;
			}
		}
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < n;j++)
			{
				sz[i][j] = -2;
			}
			}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sr[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		sz[0][0] = 1;

		int limit = m * n;
		while (count <= limit - 1)
		{
			switch (flag % 4)
			{
			case 1:
			{
					(p,q) = rt1(p, q);
					count = count + 1;
					break;
			}
			case 2:
			{
					(p,q) = rt2(p, q);
					count = count + 1;
					break;
			}
			case 3:
			{
					(p,q) = rt3(p, q);
					count = count + 1;
					break;
			}
			case 0:
			{
					(p,q) = rt4(p, q);
					count = count + 1;
					break;
			}
			}

		}
		for (i = 0;i < m * n;i++)
		{

				System.out.printf("%d\n",sc[i]);

		}
		return 0;
	}

}

