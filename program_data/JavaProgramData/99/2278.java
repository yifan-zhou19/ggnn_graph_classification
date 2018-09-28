package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] <= 18)
			{
				a = a + 1;
			}
			if (sz[i] >= 19 && sz[i] <= 35)
			{
				b = b + 1;
			}
			if (sz[i] >= 36 && sz[i] <= 60)
			{
				c = c + 1;
			}
			if (sz[i] > 60)
			{
				d = d + 1;
			}
		}
		double a1;
		double b1;
		double c1;
		double d1;
		a1 = (double)(a * 1.0 / n * 100);
		b1 = (double)(b * 1.0 / n * 100);
		c1 = (double)(c * 1.0 / n * 100);
		d1 = (double)(d * 1.0 / n * 100);
		System.out.printf("1-18: %.2lf",a1);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",b1);
			System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",c1);
			System.out.print("%%\n");
		System.out.printf("60??: %.2lf",d1);
			System.out.print("%%\n");
		return 0;
	}
}

