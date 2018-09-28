package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] z = new int[50];
		int[] x = new int[50];
		int[] v = new int[50];
		int[] s = new int[50];
		int[] d = new int[50];
		int[] f = new int[50];
		int q;
		int w;
		int r;
		int t;
		int o;
		int u;
		double[] y = new double[50];
		double[] jl = new double[50];
		double e;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		m = n * (n - 1) / 2;
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				y[k] = 1.0 * ((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]) + (c[j] - c[i]) * (c[j] - c[i]));
				jl[k] = Math.sqrt(y[k]);
				z[k] = a[i];
				x[k] = b[i];
				v[k] = c[i];
				s[k] = a[j];
				d[k] = b[j];
				f[k] = c[j];
				k++;
			}
		}

	for (l = 1;l <= m;l++)
	{
		for (i = 0;i < m - l;i++)
		{
			if (jl[i] < jl[i + 1])
			{
				e = jl[i];
				jl[i] = jl[i + 1];
				jl[i + 1] = e;
				q = z[i];
				z[i] = z[i + 1];
				z[i + 1] = q;
				w = x[i];
				x[i] = x[i + 1];
				x[i + 1] = w;
				r = v[i];
				v[i] = v[i + 1];
				v[i + 1] = r;
				t = s[i];
				s[i] = s[i + 1];
				s[i + 1] = t;
				o = d[i];
				d[i] = d[i + 1];
				d[i + 1] = o;
				u = f[i];
				f[i] = f[i + 1];
				f[i + 1] = u;


			}
		}
	}
	for (i = 0;i < m;i++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",z[i],x[i],v[i],s[i],d[i],f[i],jl[i]);
	}
	return 0;
	}
}

