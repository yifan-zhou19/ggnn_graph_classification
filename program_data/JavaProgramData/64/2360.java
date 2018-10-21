package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int j = 0;
	int[] x = new int[100];
	int[] y = new int[100];
	int[] z = new int[100];
	int[] nlx = new int[100];
	int[] nly = new int[100];
	int[] nlz = new int[100];
	int[] nfx = new int[100];
	int[] nfy = new int[100];
	int[] nfz = new int[100];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		z[i] = Integer.parseInt(tempVar4);
	}
	}
	double d;
	double[] jl = new double[45];
	for (i = 0;i < n - 1;i++)
	{
		for (int k = i + 1;k < n;k++)
		{
			d = 1.0 * (x[i] - x[k]) * (x[i] - x[k]) + 1.0 * (y[i] - y[k]) * (y[i] - y[k]) + 1.0 * (z[i] - z[k]) * (z[i] - z[k]);
				jl[j] = Math.sqrt(d);
				nfx[j] = x[i];
							nfy[j] = y[i];
							nfz[j] = z[i];
							nlx[j] = x[k];
							nly[j] = y[k];
							nlz[j] = z[k];
				j++;
		}
	}
	int result;
	result = n * (n - 1) / 2;
	for (int k = 1;k <= result;k++)
	{
	double e;
	for (j = 0;j < result - k;j++)
	{
		if (jl[j] < jl[j + 1])
		{
		e = jl[j + 1];
		jl[j + 1] = jl[j];
		jl[j] = e;

		e = nfx[j + 1];
		nfx[j + 1] = nfx[j];
		nfx[j] = e;

		e = nfy[j + 1];
		nfy[j + 1] = nfy[j];
		nfy[j] = e;

		e = nfz[j + 1];
		nfz[j + 1] = nfz[j];
		nfz[j] = e;

		e = nlx[j + 1];
		nlx[j + 1] = nlx[j];
		nlx[j] = e;

		e = nly[j + 1];
		nly[j + 1] = nly[j];
		nly[j] = e;

		e = nlz[j + 1];
		nlz[j + 1] = nlz[j];
		nlz[j] = e;
		}
	}
	}
	for (j = 0;j < result;j++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",nfx[j],nfy[j],nfz[j],nlx[j],nly[j],nlz[j],jl[j]);
	}
	return 0;
	}

}

