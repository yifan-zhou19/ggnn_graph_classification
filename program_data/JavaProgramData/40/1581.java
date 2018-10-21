package <missing>;

public class GlobalMembers
{
	public static double s(double a, double b, double c, double d, double q)
	{
	   double m;
	   double angle;
	   double r;
	   double n;
	   angle = q / 360 * 3.1415926;
	   m = (a + b + c + d) / 2;
	   n = (m - a) * (m - b) * (m - c) * (m - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
	   if (n < 0)
	   {
		   r = -1;
	   }
	   else
	   {
		   r = Math.sqrt(n);
	   }
	   return r;
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double q;
		double S;
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
		S = s(a, b, c, d, q);
		if (S == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",S);
		}
	}

}

