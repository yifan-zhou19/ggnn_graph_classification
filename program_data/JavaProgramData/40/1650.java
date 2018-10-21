package <missing>;

public class GlobalMembers
{
	public static double abc(double x,double y,double z,double w)
	{
		double s;
		s = (x + y + z + w) / 2;
		return s;
	}
	public static double abcd(double x,double y,double z,double w,double e)
	{
		double S;
		double d;
		d = abc(x, y, z, w);
		S = Math.sqrt((d - x) * (d - y) * (d - z) * (d - w) - x * y * z * w * Math.cos(e / 180 * pi) * Math.cos(e / 180 * pi));
		return S;
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double h;
		double e;
		double j;
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
			h = Double.parseDouble(tempVar5);
		}
		e = h / 2.0;

		j = abcd(a, b, c, d, e);
		if (j >= 0)
		{
		System.out.printf("%.4lf",j);
		}
		else
		{
		System.out.print("Invalid input");
		}
	}
}

