package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double q;
		double area = new double(double a,double b,double c,double d,double q);
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
			q = Double.parseDouble(tempVar5);
		}
		area(a, b, c, d, q);
	}

	public static double area(double a,double b,double c,double d,double q)
	{
		double s;
		double panduan;
		double are;
		double t;
		t = q / (2 * 180) * PI;
		s = (a + b + d + c) / 2;
		panduan = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t) * Math.cos(t);
		if (panduan < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			are = Math.sqrt(panduan);
		System.out.printf("%.4lf",are);
		}
	  return (0);
	}

}

