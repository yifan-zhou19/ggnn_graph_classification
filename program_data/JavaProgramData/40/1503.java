package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double S;
		double t;
		double f;
		e = f * DefineConstants.PI / 180;
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
			f = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		e = f * DefineConstants.PI / 180;
		t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2);
		if (t < 0)
		{
			System.out.print("Invalid input");
		}
		else if (t >= 0)
		{
			S = Math.sqrt(t);
			System.out.printf("%.4lf",S);
		}
		return 0;
	}
}

final class DefineConstants
{
	public static final double PI = 3.1415926;
}

