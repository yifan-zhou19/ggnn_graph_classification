package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double angle;
	public static double S;
	public static double s;
	public static void Main(String[] args)
	{
		double square = new double(double x1,double x2,double x3,double x4,double beta);
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
		angle = angle / 180 * PI;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle / 2) * Math.cos(angle / 2) < 0.getValue() != 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",square(a, b, c, d, angle));
		}

	}
	public static double square(double x1,double x2,double x3,double x4,double beta)
	{
		S = Math.sqrt((s - x1) * (s - x2) * (s - x3) * (s - x4) - x1 * x2 * x3 * x4 * Math.cos(beta / 2) * Math.cos(beta / 2));
		return S;
	}
}

