package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] sz = new int[8][8];
		int a;
		int b;
		int c;
		int d;
		int e;
		int f = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a = sz[i][j];
				b = a;
				c = a;
				for (e = 0;e < n;e++)
				{
					if (sz[i][e] >= b)
					{
						b = sz[i][e];
					}
				}
				for (d = 0;d < m;d++)
				{
					if (sz[d][j] <= c)
					{
						c = sz[d][j];
					}
				}
				if ((a == b) && (a == c))
				{
					System.out.printf("%d+%d",i,j);
					f++;
				}
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
		return 0;
	}



}

