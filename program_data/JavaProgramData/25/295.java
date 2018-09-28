package <missing>;

public class GlobalMembers
{
	public static double f(double a)
	{
		double b;
		if (a == 0)
		{
			b = 1.0;
		}
		else if (a == 1)
		{
			b = 2,0;
		}
		else
		{
			b = f(a - 1) * 2.0;
		}
		return b;
	}
	public static int Main()
	{
		double n;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		m = f(n);
		System.out.printf("%.0lf",m);
		return 0;
	}

}

