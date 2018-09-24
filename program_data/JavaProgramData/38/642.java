package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int h;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double b;
		double s;
		double c = 0;
		double a = 0;
		double[] sz = new double[100];
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

			for (h = 0;h < n;h++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[h] = Double.parseDouble(tempVar3);
			}
			a += sz[h];
			}
			b = (double)a / n;
		for (h = 0;h < n;h++)
		{
			c += (sz[h] - b) * (sz[h] - b);
		}
		s = (double) c / n;

		System.out.printf("%.5lf\n",Math.sqrt(s));
		s = 0;
		a = 0;
		b = 0;
		c = 0;
		}
		return 0;
	}


}

