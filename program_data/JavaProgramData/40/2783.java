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
	double s;
	double S;

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
	s = (a + b + c + d) / 2.0;
	if (((s - a) * (s - b) * (s - c) * (s - d)) <= 0)
	{
		System.out.print("Invalid input\n");
	}
	else
	{
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(PI * e / 360.0) * Math.cos(PI * e / 360.0));
	System.out.printf("%.4lf\n",S);
	}
	return 0;
	}

}

