package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		int i;
		int m;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m >= 1 && m <= 18)
			{
				a++;
			}
			else if (m > 18 && m < 36)
			{
				b++;
			}
			else if (m > 35 && m < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		a = 100 * a / n;
		b = 100 * b / n;
		c = 100 * c / n;
		d = 100 * d / n;
		System.out.printf("1-18: %.2lf",a);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",b);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",c);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",d);
		System.out.print("%%");
		return 0;
	}
}

