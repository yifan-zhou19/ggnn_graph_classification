package <missing>;

public class GlobalMembers
{
	public static double julishi(int a, int b, int c, int x, int y, int z)
	{
	double jl;
	int sum;
	sum = (a - x) * (a - x) + (b - y) * (b - y) + (c - z) * (c - z);
	jl = Math.sqrt(sum);
	return jl;
	}
	public static int Main()
	{
	int n;
	int dzb;
	int i;
	int j;
	int k;
	int m;
	int N;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] x = new int[1000];
	int[] y = new int[1000];
	int[] z = new int[1000];
	N = 3 * n;
	for (i = 0;i < N;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(x[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(y[i]) = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(z[i]) = Integer.parseInt(tempVar4);
		}
	}
	m = n * (n - 1) / 2;
	double[] jl = new double[10000];
	int[] ax = new int[10000];
	int[] ay = new int[10000];
	int[] az = new int[10000];
	int[] bx = new int[10000];
	int[] by = new int[10000];
	int[] bz = new int[10000];
	k = 1;
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			jl[k] = julishi(x[i], y[i], z[i], x[j], y[j], z[j]);
			ax[k] = x[i],ay[k] = y[i],az[k] = z[i],bx[k] = x[j],by[k] = y[j],bz[k] = z[j];
			k++;
		}
	}
	double e;
	int f;
	for (k = 1;k <= m;k++)
	{
	  for (j = 1;j <= m - k;j++)
	  {
		if (jl[j] < jl[j + 1])
		{
			e = jl[j];
			jl[j] = jl[j + 1];
			jl[j + 1] = e;
			f = ax[j];
			ax[j] = ax[j + 1];
			ax[j + 1] = f;
			f = ay[j];
			ay[j] = ay[j + 1];
			ay[j + 1] = f;
			f = az[j];
			az[j] = az[j + 1];
			az[j + 1] = f;
			f = bx[j];
			bx[j] = bx[j + 1];
			bx[j + 1] = f;
			f = by[j];
			by[j] = by[j + 1];
			by[j + 1] = f;
			f = bz[j];
			bz[j] = bz[j + 1];
			bz[j + 1] = f;
		}
	  }
	}
	for (j = 1; j <= m;j++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",ax[j],ay[j],az[j],bx[j],by[j],bz[j],jl[j]);
	}
	return 0;
	}
}

