package <missing>;

public class GlobalMembers
{
	public static double S(double a,double b,double c,double d,double degree)
	{
		double angle = degree / 360 * 3.1415926;
		double s = (a + b + c + d) / 2;
		double area = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(angle),2));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(angle),2) < 0)
		{
			return -1;
		}
		else
		{
			return area;
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double degree;
		double area;
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
			degree = Double.parseDouble(tempVar5);
		}
		area = S(a, b, c, d, degree);
		if (area == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",area);
		}
		return 0;
	}
}

