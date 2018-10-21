package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] brs = new int[103];
		int i;
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
				brs[i] = Integer.parseInt(tempVar2);
			}
			if (brs[i] < 19)
			{
				a = a + 1;
			}
			if (brs[i] > 18 && brs[i] < 36)
			{
				b = b + 1;
			}
			if (brs[i] > 35 && brs[i] < 61)
			{
				c = c + 1;
			}
			if (brs[i] > 60)
			{
				d = d + 1;
			}
		}
		a = (100.0 * a) / n;
		b = (100.0 * b) / n;
		c = (100.0 * c) / n;
		d = (100.0 * d) / n;
		System.out.printf("1-18: %.2lf",a);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",b);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",c);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",d);
		System.out.print("%%\n");
		return 0;
	}


}

