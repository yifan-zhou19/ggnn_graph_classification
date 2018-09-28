package <missing>;

public class GlobalMembers
{
	public static double i;
	public static double h;
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double e;
	public static double f(double a,double b,double c,double d,double h)
	{
		double g;
		g = Math.sqrt((i - a) * (i - b) * (i - c) * (i - d) - a * b * c * d * Math.cos(h) * Math.cos(h));
		return (g);
	}
	public static void Main()
	{
		double s;
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
		i = (a + b + c + d) / 2;
		h = e / 2 / 180 * 3.1415926;
		if ((i - a) * (i - b) * (i - c) * (i - d) < a * b * c * d * Math.cos(h) * Math.cos(h))
		{
			System.out.print("Invalid input");
		}
		else
		{
			s = f(a, b, c, d, h);
			System.out.printf("%.4lf",s);
		}
	}

}

