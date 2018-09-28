package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int j;
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double a1;
		double a2;
		double sum1 = 0.0;
		double sum2 = 0.0;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum1 = sum2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x1[j] = Double.parseDouble(tempVar3);
				}
				sum1 = sum1 + x1[j];
			}
			a1 = (double)sum1 / k;
			for (j = 0;j < k;j++)
			{
				x2[j] = (x1[j] - a1) * (x1[j] - a1);
				sum2 = sum2 + x2[j];
			}
			a2 = (double)sum2 / k;
			s = Math.sqrt(a2);
			System.out.printf("%.5lf\n",s);
		}
	}
}

