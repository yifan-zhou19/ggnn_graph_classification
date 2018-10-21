package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double A;
		double B;
		double C;
		double D;
		double E;
		double F;
		double s = new double(double a,double b,double c,double d,double e);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			C = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			D = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			E = Double.parseDouble(tempVar5);
		}
		F = s(A, B, C, D, E);
		if (F == 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",F);
		}
		return 0;
	}
	public static double s(double a,double b,double c,double d,double e)
	{
		double g;
		double h;
		double z;
		g = (a + b + c + d) / 2;
		h = e / 360 * PI;
		if (((g - a) * (g - b) * (g - c) * (g - d)) >= 0)
		{
			z = Math.sqrt((g - a) * (g - b) * (g - c) * (g - d) - a * b * c * d * (Math.cos(h)) * (Math.cos(h)));
		}
		else
		{
			z = 0;
		}
		return z;
	}
}

