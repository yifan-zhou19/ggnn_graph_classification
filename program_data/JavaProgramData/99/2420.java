package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int age;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age < 19)
			{
				a = a + 1;
			}
			else if (age < 36)
			{
				b = b + 1;
			}
			else if (age < 61)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		a = a / n * 100;
		b = b / n * 100;
		c = c / n * 100;
		d = d / n * 100;
			System.out.printf("1-18: %.2lf%%\n",a);
			System.out.printf("19-35: %.2lf%%\n",b);
			System.out.printf("36-60: %.2lf%%\n",c);
			System.out.printf("60??: %.2lf%%\n",d);
					return 0;
	}

}

