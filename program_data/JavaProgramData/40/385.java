package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double mianji = new double(double a,double b,double c,double d,double e);
		double A;
		double B;
		double C;
		double D;
		double E;
		double g;
		double S;
		double F;
		double H;
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
		S = 0.5 * (A + B + C + D);
		H = E / 360 * 3.1415926;
		F = Math.cos(H);
		if ((S - A) * (S - B) * (S - C) * (S - D) - A * B * C * D * F * F < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			g = mianji(A, B, C, D, E);
		System.out.printf("%.4lf",g);
		}

	}
		public static double mianji(double a,double b,double c,double d,double e)
		{
		double s;
		double f;
		double i;
		double h;

		s = 0.5 * (a + b + c + d);
		h = e / 360 * 3.1415926;
		f = Math.cos(h);




		i = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f * f);
		return (i);

		}

}

