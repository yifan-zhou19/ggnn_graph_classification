package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double m;
	double s;
	double l;
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
		m = Double.parseDouble(tempVar5);
	}
	m = m / 360 * 3.1415926;
	m = Math.cos(m);
	l = 1.0 / 2 * (a + b + c + d);
	s = Math.sqrt((l - a) * (l - b) * (l - c) * (l - d) - a * b * c * d * m * m);
	if ((l - a) * (l - b) * (l - c) * (l - d) - a * b * c * d * m * m > 0)
	{
	System.out.printf("%.4lf\n",s);
	}
	else
	{
	if ((l - a) * (l - b) * (l - c) * (l - d) - a * b * c * d * m * m < 0)
	{
	System.out.print("Invalid input\n");
	}
	}
	return 0;
	}






}

