package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][3];
		int i;
		int j;
		int x;
		int e;
		double[][] jl = new double[1000][1000];
		double m;
		double k;
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]);
				jl[i][j] = Math.sqrt(1.0 * m);
				if (k < jl[i][j])
				{
					k = jl[i][j];
				}
			}
		}
		for (x = 1;x <= n * (n - 1) / 2;x++)
		{
			e = 0;
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (k == jl[i][j] && e == 0)
					{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i][0],a[i][1],a[i][2],a[j][0],a[j][1],a[j][2],jl[i][j]);
					jl[i][j] = 0;
					k = 0;
					e = 1;
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (k < jl[i][j])
					{
						k = jl[i][j];
					}
				}
			}
		}
		return 0;
	}
}

