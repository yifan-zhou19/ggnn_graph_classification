package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double f = new double(double a,double b,double c,double d,double h);
		double a;
		double b;
		double c;
		double d;
		double h;
		double final;
		final String x = "Invalid input";
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
			h = Double.parseDouble(tempVar5);
		}
		final = f(a, b, c, d, h);
		if (final < 0)
		{
			System.out.println(x);
		}
		else
		{
			System.out.printf("%.4lf",final);
		}


	}

	public static double f(double a,double b,double c,double d,double h)
	{
		double under;
		double s;
		h = h / 180 * PI;
		s = (a + b + c + d) / 2;
		under = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(h / 2) * Math.cos(h / 2);
		if (under >= 0)
		{
			return (Math.sqrt(under));
		}
		else
		{
			return (-1);
		}
	}
}

