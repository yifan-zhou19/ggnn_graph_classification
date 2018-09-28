package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double angle;
	 double s;
	 double m;
	 double n;
	 double p;
	 double q;
	 double o;
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
		angle = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	m = s - a;
	n = s - b;
	p = s - c;
	q = s - d;
	o = angle / 2;
	double x;
	double y;
	double S;
	double hudu;
	hudu = 3.1415926 * o / 180;
	y = a * b * c * d * Math.cos(hudu) * Math.cos(hudu);
	x = m * n * p * q;
	S = x - y;
	if (S > 0)
	{
		s = Math.sqrt(S);
	System.out.printf("%.4lf",s);
	}
	else
	{
		System.out.print("Invalid input\n");
	}
	return 0;
	}


}

