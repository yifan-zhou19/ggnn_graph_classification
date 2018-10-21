package <missing>;

public class GlobalMembers
{
	public static double juli(int a, int b, int c, int d, int e, int f)
	{
		double result;
		double l;
		double m;
		double n;
		l = 1.0 * (d - a) * (d - a);
		m = 1.0 * (e - b) * (e - b);
		n = 1.0 * (f - c) * (f - c);
		result = Math.sqrt(l + m + n);
		return result;
	}

	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] x1 = new int[1000];
		int[] y1 = new int[1000];
		int[] z1 = new int[1000];
		int[] x2 = new int[1000];
		int[] y2 = new int[1000];
		int[] z2 = new int[1000];
		int n;
		int p = 0;
		double[] ju = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		for (int a = 0;a < 100;a++)
		{
			for (int b = a + 1;b < n;b++)
			{
				ju[p] = juli(x[a], y[a], z[a], x[b], y[b], z[b]);
				x1[p] = x[a];
				y1[p] = y[a];
				z1[p] = z[a];
				x2[p] = x[b];
				y2[p] = y[b];
				z2[p] = z[b];
				p++;
			}
		}
		for (int k = 1;k <= p - 1;k++)
		{
			double e;
			int o;
			for (int i = 0;i <= p - 1 - k;i++)
			{
				if (ju[i] < ju[i + 1])
				{
				   e = ju[i + 1];
				   ju[i + 1] = ju[i];
				   ju[i] = e;
				   o = x1[i + 1];
				   x1[i + 1] = x1[i];
				   x1[i] = o;
				   o = y1[i + 1];
				   y1[i + 1] = y1[i];
				   y1[i] = o;
				   o = z1[i + 1];
				   z1[i + 1] = z1[i];
				   z1[i] = o;
				   o = x2[i + 1];
				   x2[i + 1] = x2[i];
				   x2[i] = o;
				   o = y2[i + 1];
				   y2[i + 1] = y2[i];
				   y2[i] = o;
				   o = z2[i + 1];
				   z2[i + 1] = z2[i];
				   z2[i] = o;
				}
			}
		}
		for (int q = 0;q < p;q++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x1[q],y1[q],z1[q],x2[q],y2[q],z2[q],ju[q]);
		}
		return 0;
	}

}

