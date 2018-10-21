package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double e)
	{
		double s;
		double m;
		double n;
		double p;
		s = 1 / 2.0 * (a + b + c + d);
		p = e / 180 * pai;
		m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(p / 2.0),2);
		if (m < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
				   n = Math.sqrt(m);
			  return n;
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
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
		double n;
		n = mianji(a, b, c, d, e);
		System.out.printf("%.4lf",n);
		return 0;
	}
}

