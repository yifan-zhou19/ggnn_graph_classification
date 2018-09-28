package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	double e = 0;
	double f = 0;
	double s = 0;
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
	f = (a + b + c + d) / 2;
	s = Math.sqrt((f - a) * (f - b) * (f - c) * (f - d) - a * b * c * d * Math.cos(e / 360 * pi) * Math.cos(e / 360 * pi));
	if (s >= 0)
	{
	System.out.printf("%.4lf",s);
	}
	else
	{
	System.out.print("Invalid input\n");
	}

	return 0;
	}


}

