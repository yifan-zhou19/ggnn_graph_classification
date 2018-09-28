package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double q;
		double y = new double(double a,double b,double c,double d,double q);
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
			q = Double.parseDouble(tempVar5);
		}
		if (y(a, b, c, d, q) == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",y(a, b, c, d, q));
		}
		return 0;
	}

	public static double y(double a,double b,double c,double d,double q)
	{
		double s;
		double f;
		double test;
		s = (a + b + c + d) / 2;
		f = (q / 360) * PI;
		test = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f) * Math.cos(f);
		if (test < 0)
		{
			return -1;
		}
		else
		{
			return (Math.sqrt(test));
		}
	}

}

