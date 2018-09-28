package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double g;
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
		g = e / 180 * PI;
		double f;
		double s;
		double S;
		s = (double)1 / 2 * (a + b + c + d);
		f = (double)(s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(g / 2) * Math.cos(g / 2);
		if (f >= 0)
		{
			S = (double)Math.sqrt(f);
		System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}
}

