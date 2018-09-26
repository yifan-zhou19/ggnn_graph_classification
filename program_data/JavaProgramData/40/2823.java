package <missing>;

public class GlobalMembers
{
	public static double mianji(double a, double b, double c, double d, double jiaohe)
	{
		double s;
		double jiao;
		double y;
		s = (a + b + c + d) / 2;
		jiao = jiaohe / 360 * PI;
		y = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(jiao) * Math.cos(jiao);
		if (y >= 0)
		{
			return Math.sqrt(y);
		}
	}
	public static int Main()
	{
	double a1;
	double b1;
	double c1;
	double d1;
	double s1;
	double jiaohe1;
	double jiao1;
	double S;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a1 = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b1 = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c1 = Double.parseDouble(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d1 = Double.parseDouble(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		jiaohe1 = Double.parseDouble(tempVar5);
	}
	s1 = (a1 + b1 + c1 + d1) / 2;
	jiao1 = jiaohe1 / 360 * PI;
	if ((s1 - a1) * (s1 - b1) * (s1 - c1) * (s1 - d1) - a1 * b1 * c1 * d1 * Math.cos(jiao1) * Math.cos(jiao1) >= 0.getValue() != 0)
	{
		S = mianji(a1, b1, c1, d1, jiaohe1);
	System.out.printf("%.4lf",S);
	}
	else
	{
	System.out.print("Invalid input");
	}
	return 0;
	}

}

