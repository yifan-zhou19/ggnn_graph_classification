package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] s = new int[100];
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
				s[i] = Integer.parseInt(tempVar2);
			}
			if (s[i] > 0 && s[i] < 19)
			{
				a = a + 1;
			}
			if (s[i] > 18 && s[i] < 36)
			{
				b = b + 1;
			}
			if (s[i] > 35 && s[i] < 61)
			{
				c = c + 1;
			}
			if (s[i] > 60)
			{
				d = d + 1;
			}
		}
		a = (double)100 * a / n;
		b = (double)100 * b / n;
		c = (double)100 * c / n;
		d = (double)100 * d / n;
		System.out.print("1-18:");
		System.out.printf("% .2lf",a);
		System.out.print("%%\n");
		System.out.print("19-35:");
		System.out.printf("% .2lf",b);
		System.out.print("%%\n");
		System.out.print("36-60:");
		System.out.printf("% .2lf",c);
		System.out.print("%%\n");
		System.out.print("60??:");
		System.out.printf("% .2lf",d);
		System.out.print("%%");
		return 0;
	}
}

