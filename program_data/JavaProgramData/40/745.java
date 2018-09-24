package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double e)
	{
		double z;
		double s;
		double j;
		s = 0.5 * (a + b + c + d);
		j = e * PI / 360;
		z = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j);
		if (z > 0)
		{
			System.out.printf("%.4lf",Math.sqrt(z));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return z;
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double z;
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
		f(a, b, c, d, e);
	}
}

