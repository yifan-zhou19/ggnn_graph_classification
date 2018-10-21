package <missing>;

public class GlobalMembers
{
	public static double S(double a, double b, double c, double d, double m)
	{
		double S = 0;
		S = Math.sqrt(((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(m) * Math.cos(m));
		return S;
	}
	public static double max(double a, double b, double c, double d)
	{
		if (a < b)
		{
			a = b;
		}
		if (c < d)
		{
			c = d;
		}
		if (a < c)
		{
			a = c;
		}
		return a;
	}
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double m;
		double ans;
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
			m = Double.parseDouble(tempVar5);
		}
		if (max(a, b, c, d) < (a + b + c + d) / 2)
		{
			m = m * 3.1415926 / 180 / 2;
			ans = S(a, b, c, d, m);
			System.out.printf("%.4lf",ans);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}

}

