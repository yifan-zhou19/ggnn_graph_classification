package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double s;
		double S;
		double y;
		double m;
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
			x = Double.parseDouble(tempVar5);
		}
		double f = new double(double a,double b,double c,double d,double m);
		y = (PI * x) / 360;
		m = Math.cos(y);
		if (m < 0 || (int)(10000 * m) == 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			S = f(a, b, c, d, m);
			System.out.printf("%.4lf\n",S);
		}
		return 0;
	}
	public static double f(double a,double b,double c,double d,double m)
	{
		double s;
		double S;
		s = (a + b + c + d) / 2;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * m * m);
		return S;
	}

}

