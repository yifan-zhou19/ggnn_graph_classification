package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		   double a;
		   double b;
		   double c;
		   double D;
		   double Re;
		   double Im;
		   double x1;
		   double x2;
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
		   D = b * b - 4 * a * c;
		   if (D > 0)
		   {
				 x1 = (0 - b + Math.sqrt(D)) / (2 * a);
				 x2 = (0 - b - Math.sqrt(D)) / (2 * a);
				 System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		   }
		   else if (D == 0)
		   {
				 x1 = (0 - b) / (2 * a);
				 System.out.printf("x1=x2=%.5lf\n",x1);
		   }
			 else
			 {
				Re = (0 - b) / (2 * a);
				Im = Math.sqrt(-D) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",Re,Im,Re,Im);
			 }
		}
	}

}

