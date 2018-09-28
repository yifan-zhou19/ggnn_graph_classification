package <missing>;

public class GlobalMembers
{
	public static double distance(double q, double w, double e, double r, double t, double y)
	{
		double u;
		u = Math.sqrt((q - r) * (q - r) + (w - t) * (w - t) + (e - y) * (e - y));
		return u;
	}

	public static int Main()
	{
		int a;
		int b;
		int e;
		int f;
		int g;
		int h;
		int n;
		int i;
		double[][] d = new double[10][10];
		double c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct z
	//	{
	//		double j;
	//		double k;
	//		double l;
	//	}
	//	s[10];
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
				s[i].j = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].k = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].l = tempVar4;
			}
		}
		for (a = 0;a < n - 1;a++)
		{
			for (b = a + 1;b < n;b++)
			{
				d[a][b] = distance(s[a].j, s[a].k, s[a].l, s[b].j, s[b].k, s[b].l);
			}
		}
		for (e = n * (n - 1) / 2;e > 0;e = e-1)
		{
			for (a = 0,c = 0;a < n - 1;a++)
			{
				for (b = a + 1;b < n;b++)
				{
							  if (c < d[a][b])
							  {
						c = d[a][b];
										f = a;
							g = b;
							  }
				}
			}
				d[f][g] = 0;
				System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",s[f].j,s[f].k,s[f].l,s[g].j,s[g].k,s[g].l,c);
		}
		return 0;
	}
}

