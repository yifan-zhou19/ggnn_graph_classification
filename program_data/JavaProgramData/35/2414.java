package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t;
		int x = 0;
		int p = 0;
		int q = 0;
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
	//    printf("%d %d",m,n);
		int[][] f = new int[8][8];
		int[][] g = new int[8][3];
		for (i = 0;i < m;i++,p++)
		{
			for (t = 0;t < n;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[i][t] = Integer.parseInt(tempVar3);
				}
				if (f[i][t] > g[p][2])
				{
					g[p][0] = i;
					g[p][1] = t;
					g[p][2] = f[i][t];
				}
			}
		}
		for (p = 0,x = 0;p < m;p++)
		{
	//        printf("p=%d %d %d\n",g[p][0],g[p][1],g[p][2]);
			for (i = 0;i < n;i++)
			{
				t = g[p][1];
				if (g[p][2] > f[i][t])
				{
					x = f[i][t];
				}
				if (i == m - 1 && x == 0)
				{
					System.out.printf("%d+%d",g[p][0],g[p][1]);
					q = 1;
				}
			}
		}
		if (q == 0)
		{
			System.out.print("No");
		}
		return 0;
	}



}

