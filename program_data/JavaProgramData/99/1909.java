package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] e = new int[100];
		double n;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
				e[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (e[i] <= 18)
			{
				a += 1;
			}
			else if (e[i] <= 35)
			{
				b += 1;
			}
			else if (e[i] <= 60)
			{
				c += 1;
			}
			else
			{
				d += 1;
			}
		}
		a = a / n * 100;
		b = b / n * 100;
		c = c / n * 100;
		d = d / n * 100;
		System.out.printf("1-18: %4.2f",a);
		System.out.print("%%\n");
		System.out.printf("19-35: %4.2f",b);
		System.out.print("%%\n");
		System.out.printf("36-60: %4.2f",c);
		System.out.print("%%\n");
		System.out.printf("60??: %4.2f",d);
		System.out.print("%%");
	}
}

