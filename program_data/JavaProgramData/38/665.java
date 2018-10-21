package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int m;
		double[] a = new double[10000];
		double sum1;
		double sum2;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum1 = 0;
			sum2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (m = 0;m < n;m++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[m] = Double.parseDouble(tempVar3);
				}
				sum1 += a[m];
			}
			sum1 = (double)sum1 / n;
			for (m = 0;m < n;m++)
			{
				sum2 = sum2 + (a[m] - sum1) * (a[m] - sum1);
			}
			sum2 = (double)sum2 / n;
			s = (double)Math.sqrt(sum2);
			System.out.printf("%.5lf\n",s);
		}

		return 0;
	}

}

