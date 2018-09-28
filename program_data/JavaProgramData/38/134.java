package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] f = new double[101];
		double sum1 = 0;
		double average;
		double s;
		double[] p = f;
		double sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[j] = Double.parseDouble(tempVar3);
				}
				sum1 += f[j];
			}
			average = sum1 / n;
			sum1 = 0;
			j = 0;
			while (j <= n - 1)
			{
				sum2 += (p[j] - average) * (p[j] - average);
				j++;
			}
			s = Math.sqrt(sum2 / n);
			p = f;
			sum2 = 0;
			System.out.printf("%.5lf\n",s);
		}
	}
}

