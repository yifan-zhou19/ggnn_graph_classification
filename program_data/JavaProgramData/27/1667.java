package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double x1;
		double x2;
		double p;
		double m;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[k] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[k] = Double.parseDouble(tempVar4);
			}
		}
		for (k = 1;k <= n;k++)
		{
			p = b[k] * b[k] - 4 * a[k] * c[k];
			if (p == 0)
			{
				if (b[k] == 0)
				{
				m = 0;
				System.out.printf("x1=x2=%.5f\n",m);

				}
			else
			{
				m = -b[k] / (2 * a[k]);
				System.out.printf("x1=x2=%.5f\n",m);
			}
			}
		if (p > 0)
		{
			x1 = (-b[k] + Math.sqrt(p)) / (2 * a[k]);
			x2 = (-b[k] - Math.sqrt(p)) / (2 * a[k]);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		if (p < 0)
		{
			if (b[k] == 0)
			{
				x1 = Math.sqrt(-p) / (2 * a[k]);
				System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",x1,x1);
			}
			else
			{
				m = -b[k] / (2 * a[k]);
				q = Math.sqrt(-p) / (2 * a[k]);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",m,q,m,q);
			}
		}
		}
	}

}

