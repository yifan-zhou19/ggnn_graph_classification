package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			double[] x = new double[1000];
			double a = 0;
			double b = 0;
			double a1 = 0;
			double b1 = 0;
			double s = 0;
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
				a1 += x[j];
			}
			a = a1 / (double)n;
			for (j = 0;j < n;j++)
			{
				double m;
				m = (x[j] - a) * (x[j] - a);
				b1 += m;
			}
			b = b1 / (double)n;
			s = Math.sqrt(b);
			System.out.printf("%.5lf\n",s);
		}
	}
}

