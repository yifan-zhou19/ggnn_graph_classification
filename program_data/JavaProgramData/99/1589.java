package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double x;
		double ave1;
		double ave2;
		double ave3;
		double ave4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Double.parseDouble(tempVar2);
			}
			if (x >= 1 && x <= 18)
			{
				a += 1;
			}
			if (x >= 19 && x <= 35)
			{
				b += 1;
			}
			if (x >= 36 && x <= 60)
			{
				c += 1;
			}
			if (x > 60)
			{
				d += 1;
			}
			n = n - 1;
		}
		ave1 = a / (a + b + c + d) * 100;
		ave2 = b / (a + b + c + d) * 100;
		ave3 = c / (a + b + c + d) * 100;
		ave4 = d / (a + b + c + d) * 100;
		System.out.printf("1-18: %.2lf%%\n",ave1);
		System.out.printf("19-35: %.2lf%%\n",ave2);
		System.out.printf("36-60: %.2lf%%\n",ave3);
		System.out.printf("60??: %.2lf%%\n",ave4);
		return 0;
	}
}

