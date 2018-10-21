package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double pr)
	{
		double s;
		double area;
		double r;
		double PI;
		PI = 3.1415926;
		r = pr * PI / 180;
		s = (a + b + c + d) / 2;
		area = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r / 2) * Math.cos(r / 2));
		return (area);
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double pr;
		double s;
		double PI = 3.1415926;
		double r;
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
			pr = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		r = pr * PI / 180;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r / 2) * Math.cos(r / 2) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",f(a, b, c, d, pr));
		}
	}


}

