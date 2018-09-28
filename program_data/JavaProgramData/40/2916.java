package <missing>;

public class GlobalMembers
{
	public static double calarea(double a, double b, double c, double d, double alpha2)
	{
		double s;
		double S;
		double alpha;
		s = (double)(a + b + c + d) / 2;
		alpha = ((alpha2 * PI) / (180 * 2));
		S = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha) * Math.cos(alpha));
		if (S > 0)
		{
			return Math.sqrt(S);
		}
		else
		{
			System.out.print("Invalid input\n");
			return 0;
		}
	}

	public static int Main()
	{
		double A;
		double B;
		double C;
		double D;
		double ALPHA2;
		double area;
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
			ALPHA2 = Double.parseDouble(tempVar5);
		}
		area = calarea(A, B, C, D, ALPHA2);
		if (area != 0)
		{
			System.out.printf("%.4lf\n",area);
		}
		return 0;
	}

}

