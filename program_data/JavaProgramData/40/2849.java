package <missing>;

public class GlobalMembers
{
	public static double S(double x, double y, double z, double k, double l)
	{
		double c;
		double s;
		s = (x + y + z + k) / 2;
		c = Math.sqrt((s - x) * (s - y) * (s - z) * (s - k) - x * y * z * k * Math.cos((PI * l) / 360) * Math.cos((PI * l) / 360));
		return (c);


	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
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
			e = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((PI * e) / 360) * Math.cos((PI * e) / 360)) > 0)
		{
		   System.out.printf("%.4lf",S(a, b, c, d, e));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;


	}


}

