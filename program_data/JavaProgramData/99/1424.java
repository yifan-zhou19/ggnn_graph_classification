package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		double b;
		double c;
		double d;
		double e;
		double[] a = new double[100];
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 0 && a[i] <= 18)
			{
				sum = sum + 1.0;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				sum1 = sum1 + 1.0;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				sum2 = sum2 + 1.0;
			}
			else if (a[i] >= 61)
			{
				sum3 = sum3 + 1.0;
			}
		}
		b = (sum / n) * 100.0;
		c = (sum1 / n) * 100.0;
		d = (sum2 / n) * 100.0;
		e = (sum3 / n) * 100.0;
		System.out.printf("1-18: %.2lf%%\n", b);
		System.out.printf("19-35: %.2lf%%\n", c);
		System.out.printf("36-60: %.2lf%%\n", d);
		System.out.printf("60??: %.2lf%%\n", e);


	}


}

