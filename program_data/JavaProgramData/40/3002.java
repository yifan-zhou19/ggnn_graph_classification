package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double A;
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
		A = Double.parseDouble(tempVar5);
	}
	double s = (a + b + c + d) / 2;
	double B = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A / 360 * PI) * Math.cos(A / 360 * PI);
	if (B < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
	double H = (double)Math.sqrt(B);
	System.out.printf("%.4lf",H);
	}
	return (0);
	}

}

