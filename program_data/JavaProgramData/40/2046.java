package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double S;
		double s;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f = new double(double a,double b,double c,double d,double e);
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
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
		S = f(a, b, c, d, e);
		if (S != 0)
		{
		System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}
	public static double f(double a,double b,double c,double d,double e)
	{
		double s;
		double n;
		double m;
		s = (a + b + c + d) / 2;
		m = e / 2 / 360 * 2 * P;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m)) > 0)
		{
		n = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m));
		}
		else
		{
			n = 0;
		}
		return (n);
	}
}

