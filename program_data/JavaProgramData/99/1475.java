package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int age = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
			{
				a = a + 1;
			}
			if ((age > 18) && (age <= 35))
			{
				b = b + 1;
			}
			if ((age > 35) && (age <= 60))
			{
				c = c + 1;
			}
			if (age > 60)
			{
				d = d + 1;
			}
		}
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		A = ((double)(a * 100 / n));
		B = ((double)(b * 100 / n));
		C = ((double)(c * 100 / n));
		D = ((double)(d * 100 / n));
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("60??: %.2lf%%\n",D);

		return 0;
	}

}

