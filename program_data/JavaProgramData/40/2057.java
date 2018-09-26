package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double mian = new double(double a,double b,double c,double d,double j);
		double a;
		double b;
		double c;
		double d;
		double j;
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
			j = Double.parseDouble(tempVar5);
		}
		s = mian(a, b, c, d, j);
		if (s == 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",s);
		}
	}
	public static double mian(double a,double b,double c,double d,double j)
	{
	  double q;
	  double w;
	  double s;
	  double e;
	  q = j / 2 / 180 * 3.1415926;
	  s = (a + b + c + d) / 2;
	  w = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q);
	  if (w < 0)
	  {
		  return (0);
	  }
	  else
	  {
		  e = Math.sqrt(w);
	  return (e);
	  }
	}
}

