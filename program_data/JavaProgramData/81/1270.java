package <missing>;

public class GlobalMembers
{
	public static int zn(int n, int m, int[][] sz)
	{
		int f1 = 0;
		int f2 = 0;
		for (int a = 0;a < 5;a++)
		{
			for (int b = 0;b < 5;b++)
			{
				if (sz[a][b] == n)
				{
					f1 = 1;
				}
				if (sz[a][b] == m)
				{
					f2 = 1;
				}
			}
		}
		if (f1 == 1 && f2 == 1 && n < 5 && m < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		int a;
		int b;
		for (a = 0;a < 5;a++)
		{
			for (b = 0;b < 5;b++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[a][b] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (zn(n, m, sz) != 0)
		{
			for (b = 0;b < 5;b++)
			{
				int e;
				e = sz[n][b];
				sz[n][b] = sz[m][b];
				sz[m][b] = e;
			}
			for (a = 0;a < 5;a++)
			{
				for (b = 0;b < 4;b++)
				{
					System.out.printf("%d ",sz[a][b]);
				}
				System.out.printf("%d\n",sz[a][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

