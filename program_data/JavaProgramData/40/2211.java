package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	double q = 0;
	double s = 0;
	double e = 0;
	double t = 0;
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
		q = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	t = q / 2 / 180 * PI;
	e = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t) * Math.cos(t);
	if (e >= 0)
	{
	s = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t) * Math.cos(t));
	System.out.printf("%.4lf",s);
	}
	else
	{
		System.out.print("Invalid input");
	}
	return 0;
	}
}

