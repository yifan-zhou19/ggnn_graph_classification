package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double angle)
	{
	 double s;
	 double S;
	s = 0.5 * (a + b + c + d);
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle / 360 * P) * Math.cos(angle / 360 * P));
	return S;
	}
	public static int Main()
	{
	 double a;
	 double b;
	 double c;
	 double d;
	 double angle;
	 double s;
	 double m;
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
		angle = Double.parseDouble(tempVar5);
	}
	s = 0.5 * (a + b + c + d);
	m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle / 360 * P) * Math.cos(angle / 360 * P);
	if (m < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
	System.out.printf("%.4lf",f(a, b, c, d, angle));
	}
	return 0;
	}
}

