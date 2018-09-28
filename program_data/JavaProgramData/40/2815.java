package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double S = new double(double a,double b,double c,double d,double x);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			x = Double.parseDouble(tempVar5);
		}
		if (S(a, b, c, d, x) >= 0)
		{
			System.out.printf("%5.4lf",S(a, b, c, d, x));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}
	public static double S(double A,double B,double C,double D,double X)
	{
		double s;
		double y;
		double z;
		s = (A + B + C + D) / 2;
		y = X * P / 360;
		if ((s - A) * (s - B) * (s - C) * (s - D) - A * B * C * D * Math.cos(y) * Math.cos(y) < 0.getValue() != 0)
		{
			z = -1.0;
		}
		else
		{
			z = Math.sqrt((s - A) * (s - B) * (s - C) * (s - D) - A * B * C * D * Math.cos(y) * Math.cos(y));
		}
		return z;
	}
}

