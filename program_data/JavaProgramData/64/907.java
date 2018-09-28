package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int a;
		int b;
		int c;
		int n;
		int i;
		int r;
		int j;
		int p = 0;
		int k;
		double[] jl = new double[45];
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n * (n - 1) / 2;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				a = x[i] - x[j];
				b = y[i] - y[j];
				c = z[i] - z[j];
				jl[p] = Math.sqrt(1.0 * a * a + b * b + c * c);
				p++;
			}
		}
		double e;
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (jl[j] > jl[j + 1])
				{
					e = jl[j + 1];
					jl[j + 1] = jl[j];
					jl[j] = e;
				}
			}
		}
		double[] bcjl = new double[45];
		bcjl[0] = jl[0];
		int w;
		w = 1;
		for (i = 1;i < k;i++)
		{
			if (jl[i] == jl[i - 1])
			{
				continue;
			}
			else
			{
				bcjl[w] = jl[i];
				w++;
			}
		}
		for (r = w - 1;r >= 0;r--)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					a = x[i] - x[j];
					b = y[i] - y[j];
					c = z[i] - z[j];
					d = Math.sqrt(1.0 * a * a + b * b + c * c);
					if (d == bcjl[r])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i],y[i],z[i],x[j],y[j],z[j],d);
					}
				}
			}
		}
		return 0;
	}

}

