package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double a1;
	public static void Main()
	{
		double sq;
		double s;
		double m;
		double S = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		scanf("\n");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		scanf("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		scanf("\n");
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		scanf("\n");
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a1 = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * m * m < 0)
		{
			System.out.print("Invalid input");
		}
		else

		{
			sq = S();
		System.out.printf("%.4lf",sq);
		}
	}


		public static double S()
		{
			double a2;
			double s;
			double sq;
			double m;
			a2 = (a1 * PI) / 360;
			m = Math.cos(a2);
			s = (a + b + c + d) / 2;
			sq = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * m * m);
			return sq;
		}



}

