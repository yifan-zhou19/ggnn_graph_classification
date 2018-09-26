package <missing>;

public class GlobalMembers
{
	public static double area1(double a, double b, double c, double d, double j)
	{
		double s;
		double S;
		s = (a + b + c + d) / 2.0;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j) < 0.getValue() != 0)
		{
			S = -1;
		}
		return S;
	}
	public static int Main()
	{
		double e;
		double f;
		double g;
		double h;
		double i;
		double j;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			h = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			i = Double.parseDouble(tempVar5);
		}
		if (i > 0 && i < 360)
		{
			j = PI * i / 360;
			y = area1(e, f, g, h, j);
			if (y != -1)
			{
			System.out.printf("%.4lf",y);
			}
			else
			{
				System.out.print("Invalid input");
			}
		}
		return 0;
	}
}

