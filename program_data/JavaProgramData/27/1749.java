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
	 double x3;
	 double decision;
	 int n;
	 int i;
	 int j;
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
	   decision = b * b - 4 * a * c;
	   if (decision == 0)
	   {
		   System.out.printf("x1=x2=%.5lf\n",(-1) * b / (2 * a));
	   }
	   if (decision > 0)
	   {
	   x1 = ((-1) * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   x2 = ((-1) * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	   }
	   if (decision < 0)
	   {
		   x1 = (-1) * b / (2 * a);
		x3 = Math.sqrt((-1) * decision) / (2 * a);
		if ((x1 < 0.001) && ((-1) * x1 < 0.001))
		{
			System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",x3,x3);
		}
		else
		{
		 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x3,x1,x3);
		}
	   }
	 }
	}
}

