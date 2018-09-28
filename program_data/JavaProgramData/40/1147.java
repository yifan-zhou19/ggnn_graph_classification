package <missing>;

public class GlobalMembers
{
	public static double f(double a, double b, double c, double d, double e)
	{
	double s;
	double S;
	s = (a + b + c + d) / 2;
	e = e / 180 * 3.1415926;
	S = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2);
	return S;
	}
	public static void Main()
	{
		double nun;
		double a;
		double b;
		double c;
		double d;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		if (f(a, b, c, d, e) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			nun = Math.sqrt(f(a, b, c, d, e));
			System.out.printf("%.4lf",nun);
		}
	}
}

