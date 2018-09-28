package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double S = new double(double a,double b,double c,double d,double e);
		double a1;
		double b1;
		double c1;
		double d1;
		double e1;
		double e2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b1 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c1 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d1 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e1 = Double.parseDouble(tempVar5);
		}
		e2 = e1 / 360 * PI;
		if (S(a1, b1, c1, d1, e2) == 0)
		{
								 System.out.print("Invalid input\n");
		}
		else
		{
			 System.out.printf("%.4lf\n",S(a1, b1, c1, d1, e2));
		}

		return 0;
	}
	public static double S(double a,double b,double c,double d,double e)
	{
		   double delta;
		   double s;
		   double S;
		   s = (a + b + c + d) / 2;
		   delta = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e);
		   if (delta < 0)
		   {
					   S = 0;
		   }
		   else
		   {
				S = Math.sqrt(delta);
		   }
		   return S;
	}
}

