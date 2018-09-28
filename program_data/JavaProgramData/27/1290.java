package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		 double a;
		 double b;
		 double c;
		 double disc;
		 double x1;
		 double x2;
		 double p;
		 double q;
		 double N;
		 double m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 N = Double.parseDouble(tempVar);
		 }

		 for (m = 1;m <= N;m++)
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
		 disc = b * b - 4 * a * c;
			 if (disc > 0)
			 {
				 p = -b / (2 * a);
				 q = Math.sqrt(disc) / (2 * a);
				 x1 = p + q;
				 x2 = p - q;
				 System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			 }
		 else if (disc == 0)
		 {
			p = -b / (2 * a);
				  x1 = p;
			System.out.printf("x1=x2=%.5lf\n",x1);
		 }
		 else if (disc < 0,b / (2 * a) == 0)
		 {
			 p = b / (2 * a);
			 q = Math.sqrt(-disc) / (2 * a);
			 x1 = p + q;
			 x2 = p - q;

			 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
		 }
		 else
		 {
			 p = -b / (2 * a);
			 q = Math.sqrt(-disc) / (2 * a);
			 x1 = p + q;
			 x2 = p - q;

			 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
		 }
		 }
	}

}

