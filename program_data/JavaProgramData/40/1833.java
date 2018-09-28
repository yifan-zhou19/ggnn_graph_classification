package <missing>;

public class GlobalMembers
{
	public static double s(double a, double b, double c, double d, double f)
	{
		double p;
		double t;
		double m;
		double n;
		m = f / 2;
		t = (a + b + c + d) / 2;
		n = (t - a) * (t - b) * (t - c) * (t - d) - a * b * c * d * Math.cos(m) * Math.cos(m);
		if (n >= 0)
		{
			p = Math.sqrt(n);
			return (p);
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
		double f;
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
		f = e * 3.1415926 / 180;
		if (s(a, b, c, d, f) == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",s(a, b, c, d, f));
		}

	}
}

