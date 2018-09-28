package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] an = new int[100];
		int i;
		int j;
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
				an[i] = Integer.parseInt(tempVar2);
			}
			if (an[i] >= 1 && an[i] <= 18)
			{
				a++;
			}
			if (an[i] >= 19 && an[i] <= 35)
			{
				b++;
			}
			if (an[i] >= 36 && an[i] <= 60)
			{
				c++;
			}
			if (an[i] > 60)
			{
				d++;
			}
		}
		a = 100 * a / n;
		b = 100 * b / n;
		c = 100 * c / n;
		d = 100 * d / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%",d);
		return 0;
	}


}

