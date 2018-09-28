package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int a;
		int b;
		int i;
		int o;
		int p;
		int k;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] jl = new double[n][n];
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		k = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (a = 0;a < n;a++)
		{
			b = a + 1;
			while (b < n)
			{
				jl[a][b] = Math.sqrt((x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]) + (z[a] - z[b]) * (z[a] - z[b]));
				b++;
			}
		}
		e = 0;
		for (i = 0;i < k;i++)
		{
			for (a = 0;a < n;a++)
			{
			b = a + 1;
			  while (b < n)
			  {
				if (e < jl[a][b])
				{
					e = jl[a][b];
					o = a;
					p = b;
				}
					b++;
			  }
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[o],y[o],z[o],x[p],y[p],z[p],e);
			  jl[o][p] = 0;
			  e = 0;
		}
		return 0;
	}


}

