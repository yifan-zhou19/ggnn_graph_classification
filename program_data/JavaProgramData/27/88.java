package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
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
		i = 0;

		while (i < n)

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
		 if (Math.abs(a) <= 1e-6)
		 {
			 System.out.printf("error\n",a);
		 }
		 else
		 {
			 disc = b * b - 4 * a * c;
		   if (Math.abs(disc) <= 1e-6)
		   {
			   System.out.printf("x1=x2=%.5lf\n",-b / (2 * a));
		   }
		   else
		   {
			   if (disc > 1e-6)
			   {
				   x1 = (-b + Math.sqrt(disc)) / (2 * a);
				   x2 = (-b - Math.sqrt(disc)) / (2 * a);
			   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			   }
			   else
			   {
				   realpart = -b / (2 * a);
				   imagpart = Math.sqrt(-disc) / (2 * a);
				   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",realpart,imagpart,realpart,imagpart);

			   }
		   }
		 }

		  i++;



		}




		return 0;
	}
}

