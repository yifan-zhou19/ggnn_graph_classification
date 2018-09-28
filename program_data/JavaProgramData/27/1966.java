package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   double a;
	   double b;
	   double c;
	   double x1;
	   double x2;
	   double del;
	   double m;
	   double l;
	   int n;
	   int i;
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
			   del = b * b - 4 * a * c;
			   m = -b / (2 * a);
				   if (del > 1e-6)
				   {
					   l = Math.sqrt(del) / (2 * a);
					   x1 = m + l;
					   x2 = m - l;
					   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				   }
				   else if (Math.abs(del) <= 1e-6)
				   {
					   System.out.printf("x1=x2=%.5lf\n",m);
				   }
				   else
				   {
					   l = Math.sqrt(-del) / (2 * a);
					   if (m != 0)
					   {
						   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,l,m,l);
					   }
					   else
					   {
						   System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",l,l);
					   }
				   }


		   }
	   return 0;

	}


}

