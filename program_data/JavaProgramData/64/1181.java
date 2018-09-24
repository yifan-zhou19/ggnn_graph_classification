package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int p;
		int q;
		int d;
		double c;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[30];
		int[] a = new int[45];
		int[] b = new int[45];
		for (int i = 0;i < 3 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		double[] jl = new double[45];
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				c = Math.pow(1.0 * (sz[3 * j] - sz[3 * i]),2.0) + Math.pow(1.0 * (sz[3 * j + 1] - sz[3 * i + 1]),2.0) + Math.pow(1.0 * (sz[3 * j + 2] - sz[3 * i + 2]),2.0);
				jl[m] = Math.sqrt(c);
				a[m] = i;
				b[m] = j;
				m++;
			}
		}
		for (p = 1;p < n * (n - 1) / 2;p++)
		{
			for (q = 0;q < n * (n - 1) / 2 - p;q++)
			{
				if (jl[q] < jl[q + 1])
				{
					e = jl[q];
					jl[q] = jl[q + 1];
					jl[q + 1] = e;
					d = a[q];
					a[q] = a[q + 1];
					a[q + 1] = d;
					d = b[q];
					b[q] = b[q + 1];
					b[q + 1] = d;
				}
			}
		}
		for (p = 0;p < n * (n - 1) / 2;p++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",sz[3 * a[p]],sz[3 * a[p] + 1],sz[3 * a[p] + 2],sz[3 * b[p]],sz[3 * b[p] + 1],sz[3 * b[p] + 2],jl[p]);
		}
		return 0;
	}
}

