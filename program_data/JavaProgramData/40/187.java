package <missing>;

public class GlobalMembers
{
	public static double Main()
	{
		double yuxian;
		double s;
		double area;
		double x;
		double a;
		double b;
		double c;
		double d;
		double angle;
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
		x = angle * 0.5;
		yuxian = Math.cos(x * 2 * 3.1415926 / 360);
		s = 0.5 * (a + b + c + d); //???1/2???0.5
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * yuxian * yuxian) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			area = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * yuxian * yuxian);
			System.out.printf("%.4lf", area);
		}
		return 0;
	}
}

