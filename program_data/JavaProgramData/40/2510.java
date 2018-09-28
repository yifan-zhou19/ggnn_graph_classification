package <missing>;

public class GlobalMembers
{
	public static double S(double a, double b, double c, double d, double x)
	{
		double result = 0;
		double s;
		double y;
		s = (a + b + c + d) / 2;
		y = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x / 2 / 180 * PI) * Math.cos(x / 2 / 180 * PI);
		if (y < 0)
		{
				result = -1;
		}
		else
		{
				result = Math.sqrt(y);
		}
		return result;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double result;
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
			x = Double.parseDouble(tempVar5);
		}
		result = S(a, b, c, d, x);
		if (result < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
		System.out.printf("%.4lf\n",result);
		}
		return 0;
	}
}

