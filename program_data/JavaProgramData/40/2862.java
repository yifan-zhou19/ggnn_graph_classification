package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double S;
		double alpha;
		double m;
		double n;
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
			alpha = Double.parseDouble(tempVar5);
		}
		double s = new double(double a,double b,double c,double d);
		double t = new double(double a,double b,double c,double d);
		double r = new double(double a,double b,double c,double d,double alpha);
		m = t(a, b, c, d);
		n = r(a, b, c, d, alpha);
		if (m < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(m - n);
			System.out.printf("%.4lf",S);
		}
		return 0;
	}
	public static double s(double a,double b,double c,double d)
	{
		double w;
		double z;
		w = (a + b + c + d);
		z = w / 2;
		return (z);
	}
	public static double t(double a,double b,double c,double d)
	{
		double x;
		double h;
		double i;
		double j;
		double k;
		double l;
		x = s(a, b, c, d);
		h = x - a;
		i = x - b;
		j = x - c;
		k = x - d;
		l = h * i * j * k;
		return (l);
	}
	public static double r(double a,double b,double c,double d,double alpha)
	{
		double p;
		double q;
		double y;
		p = alpha / 720;
		q = p * 2 * PI;
		y = a * b * c * d * Math.cos(q) * Math.cos(q);
		return (y);
	}
}

