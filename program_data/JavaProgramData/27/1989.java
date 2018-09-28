package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int n;
	   double d;
	   double p;
	   double q;
	   double x1;
	   double x2;
	   double a;
	   double b;
	   double c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
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
	   p = b * b - 4 * a * c;
	   q = (0 - b) / (2 * a);
	   if (p == 0)
	   {
				 x1 = q;
				 System.out.printf("x1=x2=%.5lf\n",x1);
	   }
	   else
	   {
			if (p > 0)
			{
				   x1 = Math.sqrt(p) / (2 * a) + q;
				   x2 = -Math.sqrt(p) / (2 * a) + q;
				   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else
			{
				d = Math.sqrt(-p) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",q,d,q,d);
			}
	   }
	   }
	}
}

