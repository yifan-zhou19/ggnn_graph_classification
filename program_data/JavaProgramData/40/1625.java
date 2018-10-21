package <missing>;

public class GlobalMembers
{
	public static double i(double a,double b,double c,double d,double n)
	{
		double s;
		double S;
		double pi;
		double k;
		pi = 3.1415926;
		s = (a + b + c + d) / 2;
		k = n / 180 * pi;
		S = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k / 2) * Math.cos(k / 2);
		if (S < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",Math.sqrt(S));
		}
		return 0;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
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
			n = Double.parseDouble(tempVar5);
		}
		i(a, b, c, d, n);
	}
}

