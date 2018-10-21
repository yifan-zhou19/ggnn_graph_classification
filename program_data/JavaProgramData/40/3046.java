package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double A;
		double B;
		double C;
		double D;
		double E;
		double f = new double(double a,double b,double c,double d,double e);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			C = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			D = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			E = Double.parseDouble(tempVar5);
		}
		double SS;
		SS = f(A, B, C, D, E);
		if (SS != 0)
		{
			System.out.printf("%.4lf",SS);
		}
		return 0;
	}
	public static double f(double a,double b,double c,double d,double e)
	{
		double S;
		double s;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * p / 360) * Math.cos(e * p / 360) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
			return 0;
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * p / 360) * Math.cos(e * p / 360));
			return S;
		}
	}
}

