package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double t;
		double z;
		double area = new double(double a,double b,double c,double d,double t);
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
		z = area(a, b, c, d, t);
		if (z < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",Math.sqrt(z));
		}
	}

	public static double area(double a,double b,double c,double d,double t)
	{
		double y;
		double s;
		double PI = 3.1415926;
		  s = (a + b + c + d) / 2;
		 y = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t / 360 * PI) * Math.cos(t / 360 * PI);
		 return (y);
	}
}

