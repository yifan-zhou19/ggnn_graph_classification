package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double S = new double(double a,double b,double c, double d,double e);
		double a;
		double b;
		double c;
		double d;
		double e;
		double t;
		double g;
		double s;
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
			e = Double.parseDouble(tempVar5);
		}
		t = S(a, b, c, d, e);
		e = e / 180 * 3.1415926;
		s = (a + b + c + d) / 2;
		g = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(e / 2) * Math.cos(e / 2));
		if (g < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",t);

		}
		return 0;
	}

		public static double S(double a,double b,double c, double d,double e)
		{
			double s;
			double g;
			e = e / 180 * 3.1415926;
			s = (a + b + c + d) / 2;
			g = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(e / 2) * Math.cos(e / 2)));
			return (g);
		}





}

