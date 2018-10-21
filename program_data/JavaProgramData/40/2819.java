package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
		double output;

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
			angle = Double.parseDouble(tempVar5);
		}

		float square = new float(double a1, double b1, double c1, double d1, double angle1);

		output = square(a, b, c, d, angle);
		if (output == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",output);
		}

		return 0;
	}

	public static float square(double a1, double b1, double c1, double d1, double angle1)
	{
		double s;
		double S;
		double cs;
		double sqr;
		s = (a1 + b1 + c1 + d1) / 2;
		cs = Math.cos(angle1 * PI / 360);
		sqr = (s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * cs * cs;
		if (sqr < 0)
		{
			return -1F;
		}
		else
		{
			S = Math.sqrt(sqr);
			return S;
		}
	}
}

