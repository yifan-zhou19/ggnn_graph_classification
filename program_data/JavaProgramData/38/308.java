package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int j;
		double s;
		double[] a = new double[100];
		double sumf;
		double sums;
		double b;
		double[] c = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sumf = 0;
			sums = 0;
			b = 0;
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
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				sumf += a[j];

			}
			b = sumf / (double)n;
			for (j = 0;j < n;j++)
			{
				c[j] = (a[j] - b) * (a[j] - b);
				sums += c[j];
			}
			s = sums / n;
			System.out.printf("%.5lf\n",Math.sqrt(s));


		}
	}


}

