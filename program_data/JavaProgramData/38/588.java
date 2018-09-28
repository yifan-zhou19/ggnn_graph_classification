package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int t;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] s = new double[k];
		double sum;
		double a;

		for (i = 0;i < k;i++)
		{
			sum = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] x = new double[n];
			for (t = 0;t < n;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[t] = Double.parseDouble(tempVar3);
				}
				sum += x[t];
			}
			a = sum / n;
			sum = 0.0;
			for (t = 0;t < n;t++)
			{
				sum += (x[t] - a) * (x[t] - a);
			}
			s[i] = Math.sqrt(sum / n);

		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",s[i]);
		}
		return 0;
	}
}

