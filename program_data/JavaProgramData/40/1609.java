package <missing>;

public class GlobalMembers
{
	public static double m(double a,double b,double c,double d,double e)
	{
		double pi;
		double s;
		double sq;
		s = (a + b + c + d) / 2;
		pi = 3.1415926;
		sq = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(pi * e / 360) * Math.cos(pi * e / 360));
		return (sq);
	}

	public static void Main()
	{
		double m = new double(double a,double b,double c,double d,double e);
		double a;
		double b;
		double c;
		double d;
		double e;
		double p;
		double s;
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
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			p = m(a, b, c, d, e);
		System.out.printf("%.4lf\n",p);
		}
	}

}

