package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double ang)
	{
		double p;
		double q;
		double y;
		ang = ang / 2.0 / 180.0 * 3.1415926;
		p = (a + b + c + d) / 2.0;
		q = (p - a) * (p - b) * (p - c) * (p - d) - a * b * c * d * Math.cos(ang) * Math.cos(ang);
		y = Math.sqrt(q);
		if (q < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",y);
		}
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double ang;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			ang = Double.parseDouble(tempVar5);
		}
		f(a, b, c, d, ang);
	}


}

