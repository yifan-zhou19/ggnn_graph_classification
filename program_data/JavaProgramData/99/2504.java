package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double n;
		double m = 0;
		double t = 0;
		double x = 0;
		double y = 0;
		double[] age = new double[100];
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
			age[i] = Double.parseDouble(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
			m = m + 1;
			}
		if (age[i] > 18 && age[i] <= 35)
		{
			t = t + 1;
		}
		if (age[i] > 35 && age[i] <= 60)
		{
			x = x + 1;
		}
		else if (age[i] > 60)
		{
			y = y + 1;
		}
		}
		System.out.printf("1-18: %.2lf",m / n * 100);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",t / n * 100);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",x / n * 100);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",y / n * 100);
		System.out.print("%%\n");
		return 0;
	}

}

