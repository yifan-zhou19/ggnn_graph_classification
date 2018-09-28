package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int[] r = new int[100];
		int[] t = new int[100];
		int a;
		int b;
		int k;
		int c;
		int d;
		int p;
		double[] q = new double[100];
		double e;
		m = 0;
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
		for (k = 0;k < n;k++)
		{
			for (i = k + 1;i < n;i++)
			{
				q[m] = Math.sqrt(1.0 * (x[i] - x[k]) * (x[i] - x[k]) + 1.0 * (y[i] - y[k]) * (y[i] - y[k]) + 1.0 * (z[i] - z[k]) * (z[i] - z[k]));
				r[m] = k;
				t[m] = i;
				m++;
			}
		}
		p = n * (n - 1) / 2;
		for (a = 1;a < p + 1;a++)
		{
			for (m = 0;m < p - a;m++)
			{
				if (q[m] < q[m + 1])
				{
					e = q[m + 1];
					q[m + 1] = q[m];
					q[m] = e;
					b = r[m + 1];
					r[m + 1] = r[m];
					r[m] = b;
					b = t[m + 1];
					t[m + 1] = t[m];
					t[m] = b;
				}
			}
		}
		c = 0;
		d = 0;
		for (m = 0;m < p;m++)
		{
			c = r[m];
			d = t[m];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", x[c], y[c], z[c], x[d], y[d], z[d], q[m]);
		}
		return 0;
	}
}

