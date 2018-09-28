package <missing>;

public class GlobalMembers
{
	public static double S(double a, double b, double c, double d, double e)
	{
		double s = (a + b + c + d) / 2;
		double p = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(e),2);

		if (p < 0)
		{
			return -1;
		}
		else
		{
			return Math.sqrt(p);
		}
	}

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
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
			j = Double.parseDouble(tempVar5);
		}

		e = j / 2 * PI / 180;

		if (S(a, b, c, d, e) == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4f\n", S(a, b, c, d, e));
		}

		return 0;
	}
}

