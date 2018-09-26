package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double e)
	{
		double i;
		double k;
		double s;
		k = e / 360 * 3.1415926;
		s = (a + b + c + d) / 2;
		i = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k) * Math.cos(k);
		return i;
	}
	public static void Main()
	{
	   // double f(double a,double b,double c,double d,double e);
		double S;
		double a;
		double b;
		double c;
		double d;
		double e;
		//scanf("%lf\n,%lf\n,%lf\n,%lf\n,%lf\n",&a,&b,&c,&d,&e);
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
		if (f(a, b, c, d, e) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(f(a, b, c, d, e));
		System.out.printf("%.4lf",S);
		}
	}
}

