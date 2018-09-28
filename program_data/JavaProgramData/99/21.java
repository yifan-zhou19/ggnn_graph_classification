package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int age;
		double a;
		double b;
		double c;
		double d;
		a = b = c = d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
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
			else if (age >= 19 && age <= 35)
			{
				b++;
			}
			else if (age >= 36 && age <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		a /= (double)n;
		b /= (double)n;
		c /= (double)n;
		d /= (double)n;

		System.out.printf("1-18: %.2lf%%", a * 100.0);
		System.out.printf("\n19-35: %.2lf%%", b * 100.0);
		System.out.printf("\n36-60: %.2lf%%", c * 100.0);
		System.out.printf("\n60??: %.2lf%%", d * 100.0);

		return 0;
	}
}

