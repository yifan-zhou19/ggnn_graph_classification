package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double S = new double(double,double,double,double,double);
		double a;
		double b;
		double c;
		double d;
		double sq;
		double angle;
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
		sq = S(a, b, c, d, angle);
		if (sq == 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4f",sq);
		}
	}
	public static double S(double a,double b,double c,double d,double angle)
	{
		double s;
		double S;
		double x;
		double y;
		s = (a + b + c + d) / 2;
		x = Math.cos(angle / 360 * 3.1415926);
		y = x * x;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * y) < 0)
		{
			return (0);
		}
		else
		{
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * y);
		return (S);
		}
	}
}

