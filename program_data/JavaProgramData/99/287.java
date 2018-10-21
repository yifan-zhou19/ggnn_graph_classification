package <missing>;

public class GlobalMembers
{
	public static int[] year = new int[100];
	public static double n;
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static int Main()
	{
		int i;
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
				year[i] = Integer.parseInt(tempVar2);
			}
			if (year[i] >= 1 && year[i] <= 18)
			{
				a++;
			}
			if (year[i] <= 35 && year[i] >= 19)
			{
				b++;
			}
			if (year[i] >= 36 && year[i] <= 60)
			{
				c++;
			}
			if (year[i] > 60)
			{
				d++;
			}
		}
		a = (double)a / n * 100;
		b = (double)b / n * 100;
		c = (double)c / n * 100;
		d = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%",d);
		return 0;
	}
}

