package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double[] age = new double[99];
		double num1 = 0.00;
		double num2 = 0.00;
		double num3 = 0.00;
		double num4 = 0.00;
		int i;
		double p1;
		double p2;
		double p3;
		double p4;
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
				age[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				num1 += 1;
			}
			if ((age[i] >= 19) && (age[i] <= 35))
			{
				num2 += 1;
			}
			if ((age[i] >= 36) && (age[i] <= 60))
			{
				num3 += 1;
			}
			if (age[i] >= 61)
			{
				num4 += 1;
			}
		}
		p1 = 100 * num1 / n;
		p2 = 100 * num2 / n;
		p3 = 100 * num3 / n;
		p4 = 100 * num4 / n;
		System.out.printf("1-18: %.2lf%%\n",p1);
		System.out.printf("19-35: %.2lf%%\n",p2);
		System.out.printf("36-60: %.2lf%%\n",p3);
		System.out.printf("60??: %.2lf%%\n",p4);
		return 0;
	}
}

