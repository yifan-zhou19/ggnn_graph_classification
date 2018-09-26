package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			double[] x = new double[1000];
			double m = 0;
			double a;
			double sum = 0;
			double s;
			int k;
			int t;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (t = 0;t < k;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[t] = Double.parseDouble(tempVar3);
				}
				m = m + x[t];
			}
			a = m / k;
			for (t = 0;t < k;t++)
			{
				sum = sum + (x[t] - a) * (x[t] - a);
			}
			s = Math.sqrt(sum / (double)k);
			System.out.printf("%.5lf\n",s);
		}
	}
}

