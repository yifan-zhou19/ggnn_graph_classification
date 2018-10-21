package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double n;
		double a;
		double i;
		double c1 = 0.0;
		double c2 = 0.0;
		double c3 = 0.0;
		double c4 = 0.0;
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
				a = Double.parseDouble(tempVar2);
			}
			if (a <= 18)
			{
				c1 = c1 + 1;
				continue;
			}
			else if (a < 36)
			{
				c2 = c2 + 1;
				continue;
			}
			else if (a < 61)
			{
				c3 = c3 + 1;
				continue;
			}
			else
			{
				c4 = c4 + 1;
				continue;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",c1 / n * 100);
		System.out.printf("19-35: %.2lf%%\n",c2 / n * 100);
		System.out.printf("36-60: %.2lf%%\n",c3 / n * 100);
		System.out.printf("60??: %.2lf%%\n",c4 / n * 100);
	}

}

