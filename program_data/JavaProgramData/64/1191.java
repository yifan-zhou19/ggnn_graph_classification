package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c = 1;
		int p;
		int q;
		int n;
		int[] M = new int[46];
		int[] N = new int[46];
		int e;
		double[] x = new double[11];
		double[] y = new double[11];
		double[] z = new double[11];
		double[] l = new double[46];
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Double.parseDouble(tempVar4);
			}
		}

		for (a = 1;a < n;a++)
		{
			for (b = a + 1;b <= n;b++)
			{
				l[c] = Math.sqrt((x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]) + (z[a] - z[b]) * (z[a] - z[b]));
				M[c] = a;
				N[c] = b;
				c++;
			}
		}
		for (p = 1;p < (n * (n - 1)) / 2;p++)
		{
			for (q = p + 1;q <= (n * (n - 1));q++)
			{
				if (l[p] < l[q])
				{
					for (i = q;i > p;i--)
					{
						d = l[i];
						l[i] = l[i - 1];
						l[i - 1] = d;
						e = M[i];
						M[i] = M[i - 1];
						M[i - 1] = e;
						e = N[i];
						N[i] = N[i - 1];
						N[i - 1] = e;
					}
				}
			}
		}

		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",x[M[i]],y[M[i]],z[M[i]],x[N[i]],y[N[i]],z[N[i]],l[i]);
		}

		return 0;
	}

}

