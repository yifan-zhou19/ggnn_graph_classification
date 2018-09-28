package <missing>;

public class GlobalMembers
{
	public static double Area(double a, double b, double c, double d, double alpha)
	{
		double s;
		double sqarea;
		double area;
		s = 0.5 * (a + b + c + d);
		sqarea = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(alpha),2);
		if (sqarea >= 0)
		{
			area = Math.sqrt(sqarea);
		}
		else
		{
			return -1;
		}
		return area;
	}

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double alpha0;
		double area;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			alpha0 = Double.parseDouble(tempVar5);
		}
		area = Area(a, b, c, d, alpha0 * (PI / 360));
		if (area == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%0.4lf\n", area);
		}
		return 0;
	}
}

