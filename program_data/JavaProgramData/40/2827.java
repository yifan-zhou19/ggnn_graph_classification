package <missing>;

public class GlobalMembers
{
	public static double area(double x, double y, double z, double p, double q)
	{
	double s;
	s = (x + y + z + p) / 2;
	if ((s - x) * (s - y) * (s - z) * (s - p) - x * y * z * p * Math.cos(q) * Math.cos(q) < 0.getValue() != 0)
	{
	return 0;
	}
	else
	{
	return Math.sqrt((s - x) * (s - y) * (s - z) * (s - p) - x * y * z * p * Math.cos(q) * Math.cos(q));
	}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		result = area(a, b, c, d, PI * e / 360);
		if (result == 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4lf",result);
		}
		return 0;
	}
}

