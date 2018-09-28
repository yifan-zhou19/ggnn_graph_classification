package <missing>;

public class GlobalMembers
{
	public static void f(double a,double b,double c,double d,double alpha)
	{
		double s;
		double result;
		alpha = alpha * 3.1415926535898 / 180;
		s = (a + b + c + d) / 2;
		result = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha / 2) * Math.cos(alpha / 2);
		if (result < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			result = Math.sqrt(result);
			System.out.printf("%.4lf",result);
		}


	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double alpha;
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
			alpha = Double.parseDouble(tempVar5);
		}
		f(a, b, c, d, alpha);

	}
}

