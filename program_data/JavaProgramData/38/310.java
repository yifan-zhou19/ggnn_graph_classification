package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}


		for (i = 0;i < k;i++)
		{
			double s1 = 0;
			double m = 0;
			double o = 0;
			int n;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				s1 += x[j];
				double a = 0;
			}
			double a = (double)s1 / n;
			for (j = 0;j < n;j++)
			{
				m += (x[j] - a) * (x[j] - a);
			}
			System.out.printf("%.5f\n",Math.sqrt((double)m / n));
		}
		return 0;
	}
}

