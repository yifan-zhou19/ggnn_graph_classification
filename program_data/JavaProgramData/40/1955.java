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
	double n;
	double s;
	double x1;
	double x2;
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
	s = (a + b + c + d) / 2;
	n = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((e * PI) / 360) * Math.cos((e * PI) / 360);
	if (n >= 0)
	{
	x1 = 1;
	x2 = (x1 + n / x1) / 2;
	while (x2 - x1 > JINGDU || x1 - x2 > JINGDU)
	{
	x1 = x2;
	x2 = (x1 + n / x1) / 2;
	}
	System.out.printf("%.4lf",x2);
	}
	else if (n < 0)
	{
	System.out.print("Invalid input");
	}
	return 0;
	}
}

