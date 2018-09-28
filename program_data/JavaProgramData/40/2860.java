package <missing>;

public class GlobalMembers
{
	public static double s(double a, double b, double c, double d)
	{
	 double sf;
	 sf = (a + b + c + d) / 2;
	 return sf;
	}

	public static double US(double a, double b, double c, double d, double alpha)
	{
	 double SF;
	 SF = (s(a, b, c, d) - a) * (s(a, b, c, d) - b) * (s(a, b, c, d) - c) * (s(a, b, c, d) - d) - a * b * c * d * Math.cos(alpha) * Math.cos(alpha);
	 return SF;
	}

	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double alpha;
	double jiao;
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
		jiao = Double.parseDouble(tempVar5);
	}
	alpha = (jiao / 2) / 180 * PI;
	double final;
	if (alpha < 0)
	{
		System.out.print("Invalid input");
	}
	if (US(a, b, c, d, alpha) < 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
		 final = Math.sqrt(US(a, b, c, d, alpha));
		 System.out.printf("%.4lf", final);
	}
	return 0;
	}
}

