package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int c;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] l = new double[1000];
		double lmax;
		double u;
		double v;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 1;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i >= 2)
			{
				for (a = 1;a < i;a++)
				{
					u = Math.pow((x[i] - x[a]),2);
					v = Math.pow((y[i] - y[a]),2);
					r = u + v;
					l[c] = Math.sqrt(u + v);
					c++;
					if (c - 1 >= 2)
					{
						if (l[c - 1] > lmax)
						{
							lmax = l[c - 1];
						}
					}
					if (c - 1 == 1)
					{
						lmax = 0;
					}
				}
			}
		}
		System.out.printf("%.4lf\n",lmax);
		return 0;
	}
}

