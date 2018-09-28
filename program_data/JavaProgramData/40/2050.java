package <missing>;

public class GlobalMembers
{
	public static double s(double a,double b,double c,double d,double t)
	{
		double s;
		double u;
		double ar;
		s = (a + b + c + d) / 2;
		u = (t * PI) / 360;
		ar = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(u) * Math.cos(u);
		return (ar);
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double t;
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
			t = Double.parseDouble(tempVar5);
		}
		area = s(a, b, c, d, t);
		if (area < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			area = Math.sqrt(area);
			System.out.printf("%.4lf",area);
		}
	return 0;
	}
}

