package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[101];
		double s;
		double p;
		double f;
		double[] d = new double[101];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			s = 0;

			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				s = s + x[j];
			}

			p = s / n;
			f = 0;
			for (j = 1;j <= n;j++)
			{
				f = f + (x[j] - p) * (x[j] - p);
			}
			f = (double)f / n;
			f = Math.sqrt(f);
			d[i] = f;
		}

		for (i = 1;i <= k;i++)
		{
			System.out.printf("%.5lf\n",d[i]);
		}



	}


}

