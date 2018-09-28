package <missing>;

public class GlobalMembers
{
	public static double S(double x, double y, double z, double w, double m)
	{
		double s;
		double genxia;
		double ff;
		s = 0.5000 * (x + y + z + w);
		ff = 0.5000 * m / 180.0000 * PI;
		genxia = (s - x) * (s - y) * (s - z) * (s - w) - x * y * z * w * Math.cos(ff) * Math.cos(ff);
		return genxia;
	}
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	double genhaonei;
	double mianji;
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
	genhaonei = S(a, b, c, d, e);
	if (genhaonei < 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
		mianji = Math.sqrt(genhaonei);
		System.out.printf("%.4lf\n",mianji);
	}
	return 0;
	}
}

