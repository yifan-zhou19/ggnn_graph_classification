package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[100];
		double s;
		double a;
		double q = 0;
		double A = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0; i < k; i++)
		{
			A = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0; j < n; j++)
			{
				A = A + x[j];
			}
			a = (double)A / n;
			q = 0;
			for (j = 0; j < n; j++)
			{
				q = q + (x[j] - a) * (x[j] - a);
			}
			s = Math.sqrt(q / n);
			System.out.printf("%.5lf\n", s);
		}
		return 0;
	}
}

