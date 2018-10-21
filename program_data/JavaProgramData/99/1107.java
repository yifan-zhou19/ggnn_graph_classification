package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		double a;
		double b;
		double c;
		double d;
		double e;
		a = 0,b = 0,c = 0,d = 0;
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
				x = Integer.parseInt(tempVar2);
			}
			if (x <= 18)
			{
				a = a + 1;
			}
			else if (x > 18 && x < 36)
			{
				b = b + 1;
			}
			else if (x > 35 && x < 61)
			{
				c = c + 1;
			}
			else if (x > 60)
			{
				d = d + 1;
			}
		}
		e = a + b + c + d;
		System.out.printf("1-18: %.2lf",a / e * 100);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",b / e * 100);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",c / e * 100);
		System.out.print("%%\n");
	  System.out.printf("Over60: %.2lf",d / e * 100);
	  System.out.print("%%\n");

	return 0;
	}


}

