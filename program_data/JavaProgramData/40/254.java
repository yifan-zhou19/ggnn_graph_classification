package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final double PI = 3.1415926;
		double S;
		double a;
		double b;
		double c;
		double d;
		double s;
		double alpha;
		double inTheSqrt;
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
		s = (a + b + c + d) / 2;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			alpha = Double.parseDouble(tempVar5);
		}
		inTheSqrt = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(alpha / 360 * PI), 2);
		if (inTheSqrt < 0)
		{
			System.out.print("Invalid input\n");
			return;
		}
		S = Math.sqrt(inTheSqrt);
		System.out.printf("%.4lf\n", S);
	}
}

