package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			double f = new double(double,double,double,double,double);
			double a;
			double b;
			double c;
			double d;
			double x;
			double y;
			double s;
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
				x = Double.parseDouble(tempVar5);
			}
			y = f(a, b, c, d, x);
			if (y >= 0)
			{
					   s = Math.sqrt(y);
					 System.out.printf("%.4lf",s);
			}
			else
			{
				   System.out.print("Invalid input\n");
			}
	}
	public static double f(double a,double b,double c,double d,double x)
	{
			double s;
			double y;
			double PI = 3.1415926;
			s = (a + b + c + d) / 2;
			x = (x / 360) * PI;
			y = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x) * Math.cos(x));
			return (y);
	}

}

