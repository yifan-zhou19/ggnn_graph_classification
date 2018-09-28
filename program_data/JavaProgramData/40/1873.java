package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double S = new double(double a,double b,double c,double d,double s,double n);
		double a;
		double b;
		double c;
		double d;
		double s;
		double m;
		double n;
		double area;
		double PI = 3.1415926;
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
			m = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		n = m / (2 * 180) * PI;
		if (S(a, b, c, d, s, n) >= 0)
		{
			area = Math.sqrt(S(a, b, c, d, s, n));
		System.out.printf("%.4lf",area);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}
	public static double S(double a,double b,double c,double d,double s,double n)
	{
		double z;
		z = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(n) * Math.cos(n);
		return (z);
	}
}

