package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		int age;
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
				a++;
			}
			else if (age <= 35)
			{
				b++;
			}
			else if (age <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		a = (double)a / n * 100;
		b = (double)b / n * 100;
		c = (double)c / n * 100;
		d = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",a,b,c,d);
		return 0;
	}
}

