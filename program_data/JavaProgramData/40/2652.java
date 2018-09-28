package <missing>;

public class GlobalMembers
{
	public static double area(double a1, double b1, double c1, double d1, double e1)
	{
		double s;
		double y;
		double S;
		s = (a1 + b1 + c1 + d1) / 2;
		y = (double)(s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * Math.cos(e1 / 360.0 * PI) * Math.cos(e1 / 360.0 * PI);
		if (y < 0)
		{
			S = -1;
		}
		else
		{
			S = (double)Math.sqrt((s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * Math.cos(e1 / 360.0 * PI) * Math.cos(e1 / 360.0 * PI));
		}
		return S;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double S;
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
		S = area(a, b, c, d, e);
		if (S == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",S);
		}
		return 0;
	}
}

