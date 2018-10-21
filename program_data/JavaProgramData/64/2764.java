package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		double[] j = new double[100];
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int[] x1 = new int[100];
		int[] y1 = new int[100];
		int[] z1 = new int[100];
		int[] x2 = new int[100];
		int[] y2 = new int[100];
		int[] z2 = new int[100];
		for (int b = 0;b < n;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[b] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[b] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[b] = Integer.parseInt(tempVar4);
			}
		}


		for (int p = 0;p < n;p++)
		{
			for (int l = p + 1;l < n;l++)
			{
				k = ((x[p] - x[l]) * (x[p] - x[l]) + (y[p] - y[l]) * (y[p] - y[l]) + (z[p] - z[l]) * (z[p] - z[l])) * 1.0;
					j[c] = Math.sqrt(k);
					x1[c] = x[p];
					y1[c] = y[p];
					z1[c] = z[p];
					x2[c] = x[l];
					y2[c] = y[l];
					z2[c] = z[l];
							 c++;

			}
		}


		for (int a = 1;a <= n * (n - 1) / 2;a++)
		{
			double e;
		for (int i = 0;i < n * (n - 1) / 2 - a;i++)
		{
		if (j[i] < j[i + 1])
		{
		e = j[i + 1];
		j[i + 1] = j[i];
		j[i] = e;
		   int f;
		 f = x1[i + 1];
		x1[i + 1] = x1[i];
		x1[i] = f;
		f = y1[i + 1];
		y1[i + 1] = y1[i];
		y1[i] = f;
		f = z1[i + 1];
		z1[i + 1] = z1[i];
		z1[i] = f;

		f = x2[i + 1];
		x2[i + 1] = x2[i];
		x2[i] = f;
		f = y2[i + 1];
		y2[i + 1] = y2[i];
		y2[i] = f;
		f = z2[i + 1];
		z2[i + 1] = z2[i];
		z2[i] = f;

		}
		}
		}
		for (int i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x1[i],y1[i],z1[i],x2[i],y2[i],z2[i],j[i]);
		}
	return 0;
	}

}

