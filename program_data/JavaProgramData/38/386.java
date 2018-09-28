package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			double sum1 = 0;
			double[] b = new double[1000];
			double a;
			double sum2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum1 += x[j];
			}
			a = sum1 / n;
			for (j = 1;j <= n;j++)
			{
				b[j] = (x[j] - a) * (x[j] - a);
				sum2 += b[j];
			}
			s[i] = Math.pow((sum2 / n),0.5);
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
	return 0;
	}
}

