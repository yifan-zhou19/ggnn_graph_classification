package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
	 double a;
	 double b;
	 double c;
	 double disc;
	 double x1;
	 double x2;
	 double realpart;
	 double imagpart;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (n-- != 0)
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
		disc = b * b - 4 * a * c;
		if (disc == 0.0)
		{
			System.out.printf("x1=x2=%.5lf\n",-b / (2.0 * a));
		}

	   else
	   {
		   if (disc > 0.0)
		   {
		   x1 = (-b + Math.sqrt(disc)) / (2.0 * a);
			 x2 = (-b - Math.sqrt(disc)) / (2.0 * a);
			  System.out.printf("x1=%.5lf;",x1);
			  System.out.printf("x2=%.5lf\n",x2);
		   }
			 else
			 {
				 realpart = -b / (2.0 * a);
			  imagpart = Math.sqrt(-disc) / (2.0 * a);
			  System.out.printf("x1=%.5lf+%.5lfi;",realpart,imagpart);
			  System.out.printf("x2=%.5lf-%.5lfi\n",realpart,imagpart);
			 }
	   }
	 }
	}
}

