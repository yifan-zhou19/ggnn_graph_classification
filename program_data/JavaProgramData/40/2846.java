package <missing>;

public class GlobalMembers
{
	public static double pi = 3.1415926;
	public static int Main()
	{
		double sq = new double(double a,double b,double c,double d,double o);
		double a;
		double b;
		double c;
		double d;
		double j;
		double o;
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
			j = Double.parseDouble(tempVar5);
		}
		double q;
		double p;
		double s;
		o = j * pi / 180;
		o = o / 2;
		s = (a + b + c + d) / 2;
		p = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o) * Math.cos(o);
		if (p < 0)
		{
				System.out.print("Invalid input");
		}
		else
		{
			  q = sq(a, b, c, d, o);
			  System.out.printf("%.4f",q);
		}
		return 0;
	}
	public static double sq(double a,double b,double c,double d,double o)
	{
		  double s = 0;
		  double g = 0;
		  s = (a + b + c + d) / 2;
		  g = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o) * Math.cos(o));
		  return g;
	}

}

