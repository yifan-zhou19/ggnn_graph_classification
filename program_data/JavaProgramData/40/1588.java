package <missing>;

public class GlobalMembers
{
	public static double square(double a1,double b1,double c1,double d1,double jiao1)
	{
	double s = (a1 + b1 + c1 + d1) / 2;
	double k = Math.cos(jiao1 / 2) * Math.cos(jiao1 / 2);
	if (((s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * k) < 0)
	{
		return 0;
	}
	else
	{
		double S = Math.sqrt((s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * k);
		return S;
	}

	}

	public static void Main()
	{
	double S;
	double a;
	double b;
	double c;
	double d;
	double jiao;
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
		jiao = Double.parseDouble(tempVar5);
	}
	jiao = jiao / 360 * 2 * 3.1415926;
	S = square(a, b, c, d, jiao);
	if (S == 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
	System.out.printf("%.4lf",S);
	}

	}
}

