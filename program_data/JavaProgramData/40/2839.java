package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double e)
	{
		double s;
		double S;
		e = e / 180 * 3.1415926;
		s = (a + b + c + d) / 2;
		S = (s - a) * (s - b) * (s - c) * (s - d) - (a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2));
		if (S < 0)
		{
			return 0;
		}
		else
		{
			S = Math.sqrt(S);
		}
		return S;


	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double S;
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
		S = f(a, b, c, d, e);
		if (S == 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",S);
		}
		return 0;
	}

}

