package <missing>;

public class GlobalMembers
{
	public static double S(double a,double b,double c,double d,double rad,double s)
	{
		s = (a + b + c + d) / 2;
		return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(rad) * Math.cos(rad));
	}

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double num;
		double rad;
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
			num = Double.parseDouble(tempVar5);
		}
		rad = num / 360 * 3.1415926;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(rad) * Math.cos(rad) < 0.getValue() != 0)
		{
		   System.out.print("Invalid input");
		}
		else
		{

		System.out.printf("%.4lf\n",S(a, b, c, d, rad, s));
		}
		return 0;
	}
}

