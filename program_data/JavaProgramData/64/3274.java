package <missing>;

public class GlobalMembers
{
	public static double swap(tangible.RefObject<Double> x, tangible.RefObject<Double> y)
	{
		double t;
		t = x.argValue;
		x.argValue = y.argValue;
		y.argValue = t;
		return 0;
	}
	public static int Main()
	{
		int p;
		int n;
		int i;
		int j;
		double q;
		double[] x = new double[11];
		double[] y = new double[11];
		double[] z = new double[11];
		double px;
		double py;
		double pz;
		double[] x1 = new double[46];
		double[] y1 = new double[46];
		double[] z1 = new double[46];
		double[] x2 = new double[46];
		double[] y2 = new double[46];
		double[] z2 = new double[46];
		double[] l = new double[46];
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Double.parseDouble(tempVar4);
			}
		}
		p = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				x1[p] = x[i];
				y1[p] = y[i];
				z1[p] = z[i];
				x2[p] = x[j];
				y2[p] = y[j];
				z2[p] = z[j];
				px = x[i] - x[j];
				py = y[i] - y[j];
				pz = z[i] - z[j];
				q = Math.pow(px,2) + Math.pow(py,2) + Math.pow(pz,2);
				l[p] = Math.pow(q,0.5);
				p++;
			}
		}
		p--;
		for (i = p;i >= 0;i--)
		{
			for (j = 0;j < p;j++)
			{
				if (l[j] < l[j + 1])
				{
					swap(l[j], l[j + 1]);
					swap(x1[j], x1[j + 1]);
					swap(y1[j], y1[j + 1]);
					swap(z1[j], z1[j + 1]);
					swap(x2[j], x2[j + 1]);
					swap(y2[j], y2[j + 1]);
					swap(z2[j], z2[j + 1]);
				}
			}
		}
		for (i = 0;i <= p;i++)
		{
			System.out.printf("(%g,%g,%g)-(%g,%g,%g)=%.2lf\n",x1[i],y1[i],z1[i],x2[i],y2[i],z2[i],l[i]);

		}
		return 0;
	}

}

