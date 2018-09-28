package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double angle)
	{
		double s;
		double sum;
		s = (a + b + c + d) / 2;
		sum = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(3.1415926 * angle / 360) * Math.cos(3.1415926 * angle / 360));
	return sum;
	}

	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
		double k;
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
		angle = Double.parseDouble(tempVar5);
	}
	k = area(a, b, c, d, angle);
	if (k >= 0)
	{
		System.out.printf("%.4lf\n",k);
	}
	else
	{
		System.out.print("Invalid input");
	}

	}


}

