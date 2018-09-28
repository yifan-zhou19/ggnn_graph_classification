package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double n = 0;
		double i = 0;
		double by = 0;
		double x_1 = 0;
		double x_2 = 0;
		double x_3 = 0;
		double x_4 = 0;
		double l1;
		double l2;
		double l3;
		double l4;
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
				by = Double.parseDouble(tempVar2);
			}
			if (by <= 18)
			{
				x_1++;
			}
			if (by <= 35 && by >= 19)
			{
				x_2++;
			}
			if (by <= 60 && by >= 36)
			{
				x_3++;
			}
			if (by >= 61)
			{
				x_4++;
			}
		}
		l1 = 100 * x_1 / n;
		l2 = 100 * x_2 / n;
		l3 = 100 * x_3 / n;
		l4 = 100 * x_4 / n;
		System.out.printf("1-18: %.2lf%%\n",l1);
		System.out.printf("19-35: %.2lf%%\n",l2);
		System.out.printf("36-60: %.2lf%%\n",l3);
		System.out.printf("60??: %.2lf%%\n",l4);
	}

}

