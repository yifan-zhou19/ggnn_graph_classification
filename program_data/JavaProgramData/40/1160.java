package <missing>;

public class GlobalMembers
{
	public static double ji(double a, double b, double c, double d, double jiao)
	{
		double s = 0;
		double S;
		S = (a + b + c + d) / 2.0;
		jiao = jiao / 360.0 * PI;
		if (Math.sqrt((S - a) * (S - b) * (S - c) * (S - d) - a * b * c * d * Math.cos(jiao) * Math.cos(jiao)) >= 0)
		{
			s = Math.sqrt((S - a) * (S - b) * (S - c) * (S - d) - a * b * c * d * Math.cos(jiao) * Math.cos(jiao));
		}
		else
		{
			System.out.print("Invalid input");
			return 0;
		}
		return s;
	}
	public static int Main()
	{
		double x;
		double y;
		double z;
		double k;
		double du;
		double guo;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			k = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			du = Double.parseDouble(tempVar5);
		}
		if ((guo = ji(x, y, z, k, du)) != 0)
		{
		System.out.printf("%.4lf",guo);
		}
		return 0;
	}
}

