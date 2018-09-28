package <missing>;

public class GlobalMembers
{
	public static double s;
	public static double s2;
	public static double size(double x)
	{
		return Math.sqrt(s2);
	}

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double jd;
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
			jd = Double.parseDouble(tempVar5);
		}

		s = (a + b + c + d) / 2;

		s2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(jd / 180 * PI / 2) * Math.cos(jd / 2 / 180 * PI);

		if (s2 >= 0)
		{
			System.out.printf("%.4lf",size(s2));
		}
		else
		{
			System.out.print("Invalid input");
		}

		return 0;
	}


}

