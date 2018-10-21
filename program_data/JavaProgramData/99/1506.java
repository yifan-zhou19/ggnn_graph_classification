package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;
		double sum4 = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
		if (a >= 1 && a <= 18)
		{
			sum1 += 1.0;
		}
		else if (a >= 19 && a <= 35)
		{
			sum2 += 1.0;
		}
		else if (a >= 36 && a <= 60)
		{
			sum3 += 1.0;
		}
		else if (a > 60)
		{
			sum4 += 1.0;
		}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)(sum1 / n) * 100.0);
		System.out.printf("19-35: %.2lf%%\n",(double)(sum2 / n) * 100.0);
		System.out.printf("36-60: %.2lf%%\n",(double)(sum3 / n) * 100.0);
		System.out.printf("60??: %.2lf%%\n",(double)(sum4 / n) * 100.0);
		return 0;
	}
}

