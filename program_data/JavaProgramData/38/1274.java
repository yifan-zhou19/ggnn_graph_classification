package <missing>;

public class GlobalMembers
{
	public static double calculate(double[] a, int n)
	{
		int i;
		double m;
		double sum = 0;
		double s;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		m = sum / n;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = (a[i] - m) * (a[i] - m) + sum;
		}
		s = Math.sqrt(sum / n);
		return s;
	}

	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double s;
		double[] a = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
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
			s = calculate(a, n);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

