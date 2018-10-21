package <missing>;

public class GlobalMembers
{
	public static void dx(tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	{
		int e = 0;
		e = x.argValue;
		x.argValue = y.argValue;
		y.argValue = e;
		return;
	}
	public static void ds(tangible.RefObject<Double> x, tangible.RefObject<Double> y)
	{
		double r = 0;
		r = x.argValue;
		x.argValue = y.argValue;
		y.argValue = r;
		return;


	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int q;
		int p;
		int l;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = 0.5 * n * (n - 1);
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		double o;
		double[] jl = new double[p];
		int[] xx = new int[p];
		int[] yy = new int[p];
		int[] zz = new int[p];
		int[] xa = new int[p];
		int[] ya = new int[p];
		int[] za = new int[p];
		q = 0;
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
				xx[q] = x[i];
				yy[q] = y[i];
				zz[q] = z[i];
				xa[q] = x[j];
				ya[q] = y[j];
				za[q] = z[j];
				jl[q] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				q++;
			}
		}

		for (i = 0;i < p;i++)
		{
			for (j = 0;j < p - 1;j++)
			{
				if (jl[j] < jl[j + 1])
				{
					k = xx[j];
					xx[j] = xx[j + 1];
					xx[j + 1] = k;
					k = yy[j];
					yy[j] = yy[j + 1];
					yy[j + 1] = k;
					k = zz[j];
					zz[j] = zz[j + 1];
					zz[j + 1] = k;
					k = ya[j];
					ya[j] = ya[j + 1];
					ya[j + 1] = k;
					k = xa[j];
					xa[j] = xa[j + 1];
					xa[j + 1] = k;
					k = za[j];
					za[j] = za[j + 1];
					za[j + 1] = k;
					o = jl[j];
					jl[j] = jl[j + 1];
					jl[j + 1] = o;

				}

			}

		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",xx[i],yy[i],zz[i],xa[i],ya[i],za[i],jl[i]);
		}
		return 0;

	}


}

