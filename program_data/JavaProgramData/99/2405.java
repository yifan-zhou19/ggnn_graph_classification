package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;

		int m;
		double b;
		double c;
		double d;
		double e;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m >= 1 && m <= 18)
			{
				b += 1;
			}

			if (m >= 19 && m <= 35)
			{
				c += 1;
			}

			if (m >= 36 && m <= 60)
			{
				d += 1;
			}

			if (m >= 61)
			{
				e += 1;
			}

		}
		System.out.printf("1-18: %.2lf",(double)(b / n) * 100);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",(double)(c / n) * 100);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",(double)(d / n) * 100);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",(double)(e / n) * 100);
		System.out.print("%%\n");
	}
}

