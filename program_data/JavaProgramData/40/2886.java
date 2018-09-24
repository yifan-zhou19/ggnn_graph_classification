package <missing>;

public class GlobalMembers
{
	public static double cal(double a, double b, double c, double d, double ang)
	{
		double ans;
		double s;
		s = (a + b + c + d) / 2;
		ans = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ang) * Math.cos(ang);
		return ans;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double ang;
		double x;
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
			ang = Double.parseDouble(tempVar5);
		}
		ang /= 2;
		ang = ang * PI / 180;
		x = cal(a, b, c, d, ang);
		if (x <= 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			area = Math.sqrt(x);
			System.out.printf("%.4lf",area);
		}
		return 0;
	}

}

