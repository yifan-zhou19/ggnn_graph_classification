package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double k;
		double t;
		double m;
		double l;
		int h;
		int n;
		double[] u = new double[32768];
		double[] v = new double[32768];
		double[] w = new double[32768];
		double[] e = new double[32768];
		double[] f = new double[32768];
		double[] g = new double[32768];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			h = 1;
			while (h <= n)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					u[h] = Double.parseDouble(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					v[h] = Double.parseDouble(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					w[h] = Double.parseDouble(tempVar4);
				}
					k = v[h] * v[h] - 4 * u[h] * w[h];
					t = -k;
				if (k > 0)
				{
					e[h] = -v[h] / (2 * u[h]);
					f[h] = Math.sqrt(k) / (2 * u[h]);
					g[h] = 0;
				}
				else if (k < 0)
				{
					e[h] = -v[h] / (2 * u[h]);
					f[h] = Math.sqrt(t) / (2 * u[h]);
					g[h] = 1;
				}
				else
				{
					e[h] = -v[h] / (2 * u[h]);
					f[h] = 0;
					g[h] = 2;
				}
				h++;
			}
			h = 1;
			while (h <= n)
			{
					m = e[h] + f[h];
				l = e[h] - f[h];
				if (Math.abs(m) < 1e-6)
				{
					m = 0;
				}
				if (Math.abs(l) < 1e-6)
				{
					l = 0;
				}
							if (Math.abs(e[h]) < 1e-6)
							{
					e[h] = 0;
							}
				if (Math.abs(f[h]) < 1e-6)
				{
					f[h] = 0;
				}
				if (g[h] == 0)
				{
					System.out.printf("x1=%.5f;x2=%.5f\n",m,l);
				}
				if (g[h] == 1)
				{
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e[h],f[h],e[h],f[h]);
				}
				if (g[h] == 2)
				{
					System.out.printf("x1=x2=%.5f\n",m);
				}
				h++;
			}
	}

}

