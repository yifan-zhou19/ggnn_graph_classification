package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i = 1;
	 int n;
	 double x1;
	 double x2;
	 double m;
	 double t;
	 double a;
	 double b;
	 double c;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (i <= n)
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
		   if (b * b == a * c * 4)
		   {
			   x1 = (-b) / (2 * a);
			   System.out.printf("x1=x2=%.5lf\n",x1);
		   }
		   else
		   {
			   if (b * b > 4 * a * c)
			   {

				   x1 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				   x2 = (0 - b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					   System.out.printf("x1=%.5lf;",x1);
					   System.out.printf("x2=%.5lf\n",x2);
			   }
			   else
			   {
				  m = Math.sqrt(0 - b * b + 4 * a * c) / (2 * a);

				  t = -b / (2 * a);
				  if (t == 0)
				  {
					  t = -t;
				  System.out.printf("x1=%.5lf+%.5lfi;",t,m);
				  System.out.printf("x2=%.5lf-%.5lfi\n",t,m);
				  }
				  else
				  {
				   System.out.printf("x1=%.5lf+%.5lfi;",t,m);
				  System.out.printf("x2=%.5lf-%.5lfi\n",t,m);
				  }

			   }
		   }
	   i = i + 1;
	 }

	}
}

