package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int h;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] x = new double[k];
		double s;
		double a;
		double d;
		double f;
		for (i = 0;i < k;i++)
		{
			d = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] x = new double[n];
			for (h = 0;h < n;h++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[h] = Double.parseDouble(tempVar3);
				}
				d += x[h];
			}
			a = d / n;
			f = 0.0;
			for (h = 0;h < n;h++)
			{
				f += (x[h] - a) * (x[h] - a);
			}
			x[i] = Math.sqrt(f / n);
			System.out.printf("%.5f\n",x[i]);
		}
		return 0;
	}


}

