package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double area = new double(double w,double x,double y,double z,double v);
		double a;
		double b;
		double c;
		double d;
		double t;
		double s;
		double p;
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
		t = Double.parseDouble(tempVar5);
	}
	s = 0.5 * (a + b + c + d);
		r = PI * t / 360;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r) * Math.cos(r)) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			p = area(a, b, c, d, t);
			System.out.printf("%.4lf",p);
		}
	}
	   public static double area(double w,double x,double y,double z,double v)
	   {
			double s1;
			double S;
			s1 = 0.5 * (w + x + y + z);
			v = PI * v / 360;
			S = Math.sqrt((s1 - w) * (s1 - x) * (s1 - y) * (s1 - z) - w * x * y * z * Math.cos(v) * Math.cos(v));
			 return (S);
	   }


}

