package <missing>;

public class GlobalMembers
{
	public static double S(double a, double b, double c, double d, double e)
	{
		double s;
		double f;
		double t;
		double m;
		s = (a + b + c + d) / 2;
		f = e * 3.1415926 / (180 * 2);
		t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f) * Math.cos(f);
		if (t >= 0)
		{
			m = Math.sqrt(t);
			return (m);
		}
		else
		{
			return (-1);
		}
	}
	public static int Main()
	{
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		if (S(a, b, c, d, e) == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf",S(a, b, c, d, e));
		}
	}
}

