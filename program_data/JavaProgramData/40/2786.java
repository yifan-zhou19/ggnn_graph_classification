package <missing>;

public class GlobalMembers
{
	public static double S(double a, double b, double c, double d, double hudu)
	{
		double s = (a + b + c + d) / 2;
		double S2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(hudu) * Math.cos(hudu);
		if (S2 < 0)
		{
			return 1;
		}
		else
		{
			return Math.sqrt(S2);
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
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
		double hudu = e / 360 * PI;
		if (S(a, b, c, d, hudu) == 1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",S(a, b, c, d, hudu));
		}
		return 0;
	}
}

