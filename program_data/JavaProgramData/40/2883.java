package <missing>;

public class GlobalMembers
{
	public static double sq(double a, double b, double c, double d, double ang)
	{
		double l = (a + b + c + d) / 2;
		double rad = PI * ang / 360;
		double m = Math.cos(rad);
		double n = (l - a) * (l - b) * (l - c) * (l - d) - a * b * c * d * m * m;
		if (n < 0)
		{
			System.out.print("Invalid input");
					  return 0;
		}
		double t = Math.sqrt(n);
		return t;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double ang;
		double s;
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
			ang = Double.parseDouble(tempVar5);
		}
		s = sq(a, b, c, d, ang);
			 if (s != 0)
			 {
			 System.out.printf("%.4lf",s);
			 }
		return 0;
	}

}

