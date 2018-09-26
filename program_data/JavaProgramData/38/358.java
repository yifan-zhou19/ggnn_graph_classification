package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (i < m)
		{
			double[] a = new double[10000];
			double x;
			double s;
			double sum1 = 0;
			double sum2 = 0;
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
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
			 sum1 = sum1 + a[j];
			}
			x = sum1 / n;
			for (j = 0;j < n;j++)
			{
				sum2 = sum2 + (a[j] - x) * (a[j] - x);
			}
			s = Math.sqrt(sum2 / n);
			 System.out.printf("%.5lf\n",s);
			 i++;
		}
	}


}

