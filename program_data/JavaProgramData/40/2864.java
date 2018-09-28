package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double squ = new double(double a,double b,double c,double d,double e);
		double a;
		double b;
		double c;
		double d;
		double e;
		double y;
		double s;
		double n;
		double f;
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
			e = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		f = e * 3.1415926 / 360;
		n = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f) * Math.cos(f);
		if (n < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			y = squ(a, b, c, d, e);
			System.out.printf("%.4f\n",y);
		}
		return 0;
	}

	public static double squ(double a,double b,double c,double d,double e)
	{
		double s;
		double m;
		double n;
		double f;
		s = (a + b + c + d) / 2;
		f = e * 3.1415926 / 360;
		n = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f) * Math.cos(f);
		m = Math.sqrt(n);
		return (m);
	}


}

