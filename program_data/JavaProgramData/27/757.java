package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   double a;
	   double b;
	   double c;
	   double d;
	   double x1;
	   double x2;
	   double i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (; n > 0 ; n--)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 c = Double.parseDouble(tempVar4);
		 }
		 d = b * b - 4 * a * c;
		 if (d > 0)
		 {
		   x1 = (-b + Math.sqrt(d)) / (2 * a);
		   x2 = (-b - Math.sqrt(d)) / (2 * a);
		   if (x1 == 0)
		   {
			   x1 = 0;
		   }
		   if (x2 == 0)
		   {
			   x2 = 0;
		   }
		   System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
		 }
		  else if (d == 0)
		  {
			x1 = -b / (2 * a);
			if (x1 == 0)
			{
				x1 = 0;
			}
			System.out.printf("x1=x2=%.5lf\n", x1);
		  }
		  else
		  {
			x1 = -b / (2 * a);
			x2 = Math.sqrt(-d) / (2 * a);
			if (x1 == 0)
			{
				x1 = 0;
			}
			if (x2 == 0)
			{
				x2 = 0;
			}
			if (x2 < 0)
			{
				x2 = -x2;
			}
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", x1, x2, x1, x2);
		  }
	   }
	  // getchar (); getchar ();
	   return 0;
	}


}

