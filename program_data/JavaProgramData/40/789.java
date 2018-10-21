package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double s;
	double x;
	double Y;

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
		x = Double.parseDouble(tempVar5);
	}
	s = 1.0 / 2 * (a + b + c + d);
	x /= 2;
	Y = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x * 3.1415926 / 180) * Math.cos(x * 3.1415926 / 180));
	if ((s - a) * (s - b) * (s - c) * (s - d) < a * b * c * d * Math.cos(x * 3.1415926 / 180) * Math.cos(x * 3.1415926 / 180))
	{
	System.out.print("Invalid input");
	}
	else
	{
		System.out.printf("%.4lf",Y);
	}
	return 0;
	}
}

