package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double A)
	{
		double s;
		double S;
		double M;
	  s = (a + b + c + d) / 2;
	  M = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A * 3.1415926 / 360) * Math.cos(A * 3.1415926 / 360);
	  if (M < 0)
	  {
		  S = -1;
	  }
	 else
	 {
		 S = Math.sqrt(M);
	 }
	  return (S);
	}
	public static void Main()
	{
		double f = new double(double a,double b,double c,double d,double A);
		double a;
		double b;
		double c;
		double d;
		double A;
		double x;
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
			A = Double.parseDouble(tempVar5);
		}
		x = f(a, b, c, d, A);
		if (x < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",x);
		}
	}
}

