package <missing>;

public class GlobalMembers
{
	public static double s(double a, double b, double c, double d, double du)
	{
		double ps;
		double ss;
		double rad;
		rad = du * PI / 360;
		ss = (a + b + c + d) / 2;
		if (((ss - a) * (ss - b) * (ss - c) * (ss - d) - a * b * c * d * Math.cos(rad) * Math.cos(rad)) < 0)
		{
			return 0;
		}
		else
		{
			ps = Math.sqrt((ss - a) * (ss - b) * (ss - c) * (ss - d) - a * b * c * d * Math.cos(rad) * Math.cos(rad));
			return ps;
		}

	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double du;
		double s2;
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
			du = Double.parseDouble(tempVar5);
		}
		s2 = s(a, b, c, d, du);
		if (s2 == 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",s2);
		}
		return 0;
	}
}

