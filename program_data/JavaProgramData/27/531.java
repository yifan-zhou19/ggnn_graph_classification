package <missing>;

public class GlobalMembers
{
	public static double f5(double x)
	{
		   long y;
		   if (x > 0)
		   {
		   y = (x + 0.000005) * 100000;
		   }
		   else
		   {
			   y = (x - 0.000005) * 100000;
		   }
		   x = (double)y / 100000;
		   x = x;
		   return x;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a;
		double b;
		double c;
		double delta;
		double p;
		double q;
		double p1;
		double q1;
		double r;
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = Double.parseDouble(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b = Double.parseDouble(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead(" ");
						 if (tempVar4 != null)
						 {
							 c = Double.parseDouble(tempVar4);
						 }
						 delta = b * b - 4 * a * c;
						 q = Math.sqrt(Math.abs(delta));
						 q1 = Math.sqrt(Math.abs(delta)) / (2 * a);
						 p = -b;
						 p1 = -b / (2 * a);
						 r = 2 * a;
						 if (q >= 0.000005 && delta > 0)
						 {
							 System.out.printf("x1=%.5lf;x2=%.5f\n",f5((p + q) / r),f5((p - q) / r));
						 }
						 else if (delta < 0)
						 {
							 System.out.printf("x1=%.5lf+%.5fi;x2=%.5lf-%.5lfi\n",f5(p1),q1,f5(p1),q1);
						 }
						 else
						 {
							 System.out.printf("x1=x2=%.5f\n",f5(p1));
						 }
		}

		return 0;
	}
}

