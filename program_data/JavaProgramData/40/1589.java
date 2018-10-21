package <missing>;

public class GlobalMembers
{
	public static double s;
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double angle;
	public static int Main()
	{
		double area = new double(double x,double y,double z,double w,double foot);
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
		if (area(a, b, c, d, angle) >= 0)
		{
			System.out.printf("%.4lf",area(a, b, c, d, angle));
		}
		else
		{
			System.out.print("Invalid input");
		}
	}
	public static double area(double x,double y,double z,double w,double foot)
	{
		double AREA;
		double s;
		double num;
		double PI = 3.1415926;
		s = (x + y + z + w) / 2;
		num = (s - x) * (s - y) * (s - z) * (s - w) - x * y * z * w * Math.cos(foot / 360 * PI) * Math.cos(foot / 360 * PI);
		if (num >= 0)
		{
			return (Math.sqrt(num));
		}
		else
		{
			return (-1);
		}
	}
}

