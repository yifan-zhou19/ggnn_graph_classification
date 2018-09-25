package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] age = new int[100];
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				a += 1;
			}
			else if (age[i] >= 19 && age[i] <= 35)
			{
				b += 1;
			}
			else if (age[i] >= 36 && age[i] <= 60)
			{
				c += 1;
			}
			else
			{
				d += 1;
			}

		}
		System.out.printf("1-18: %.2lf%%\n",a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",b / n * 100);
		System.out.printf("36-60: %.2lf%%\n",c / n * 100);
		System.out.printf("60??: %.2lf%%",d / n * 100);
	}
}

