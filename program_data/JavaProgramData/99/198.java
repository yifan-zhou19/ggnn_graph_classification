package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] patient = new double[100];
		for (int m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patient[m] = Double.parseDouble(tempVar2);
			}
		}
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double p;
		for (int o = 0;o < n;o++)
		{
			p = patient[o];
			if (p > 0 && p <= 18)
			{
				a++;
			}
			if (p >= 19 && p <= 35)
			{
				b++;
			}
			if (p >= 36 && p <= 60)
			{
				c++;
			}
			if (p > 60)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",a / (a + b + c + d) * 100);
		System.out.printf("19-35: %.2lf%%\n",b / (a + b + c + d) * 100);
		System.out.printf("36-60: %.2lf%%\n",c / (a + b + c + d) * 100);
		System.out.printf("60??: %.2lf%%",d / (a + b + c + d) * 100);
		return 0;
	}
}

