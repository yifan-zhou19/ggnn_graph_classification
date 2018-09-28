package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double ss = new double(double a1,double b1,double c1,double d1,double e1);
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
				 e = Double.parseDouble(tempVar5);
			 }
		s = ss(a, b, c, d, e);
		if (s == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
					  System.out.printf("%.4lf",s);
		}
		return 0;
	}
		public static double ss(double a1,double b1,double c1,double d1,double e1)
		{
			double S;
			double s;
			double n;
		   s = (a1 + b1 + c1 + d1) / 2;
		   e1 = PI * e1 / 360;
		   n = (s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * Math.cos(e1) * Math.cos(e1);
		   if (n > 0)
		   {
		   S = Math.sqrt(n);
		   return S;
		   }
		   else if (n < 0)
		   {
		   return -1;
		   }
		}
}

