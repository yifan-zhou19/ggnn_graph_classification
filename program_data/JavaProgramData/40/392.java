package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double SS = new double(double a,double b,double c,double d,double jiao);
	double a;
	double b;
	double c;
	double d;
	double jiao;
	double s;
	double j;
	double pi = 3.1415926;
	double mianji;
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
		jiao = Double.parseDouble(tempVar5);
	}
	s = 1.0 / 2.0 * (a + b + c + d);
	j = jiao * pi / 360.0;
	if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j)) < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
		mianji = SS(a, b, c, d, jiao);
		System.out.printf("%.4lf",mianji);
	}
	}
	public static double SS(double a,double b,double c,double d,double jiao)
	{
		double j;
		double s;
		double mianji;
		double pi = 3.1415926;
	s = 1.0 / 2.0 * (a + b + c + d);
	j = jiao * pi / 360.0;
	mianji = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j));
	return (mianji);
	}
}

