package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int j;
		int i;
		double t;
		double sum1 = 0;
		double sum2 = 0;
		double a;
		double s;
		double[] x = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum1 = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t = Double.parseDouble(tempVar3);
				}
				x[i] = t;
				sum1 = sum1 + x[i];
			}
			a = sum1 / (double)n;
			sum2 = 0;
			for (i = 0;i < n;i++)
			{
				sum2 = sum2 + (x[i] - a) * (x[i] - a);
			}
			s = Math.sqrt(sum2 / (double)n);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

