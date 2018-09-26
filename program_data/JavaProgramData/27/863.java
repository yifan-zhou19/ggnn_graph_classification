package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		while (i <= n)
		{

					double a;
					double b;
					double c;
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
	double x1;
	double x2;
	   if (b * b - 4 * a * c > 0)
	   {
	   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	   }
	   if (b * b - 4 * a * c < 0.00000001 && b * b - 4 * a * c>-0.00000001)
	   {
	   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   System.out.printf("x1=x2=%.5f\n",x1);
	   }
		if (b * b - 4 * a * c < -0.00000001.getValue() != 0)
		{
	   double n;
	   double m;
	   n = -b / (2 * a);
	   m = Math.sqrt(4 * a * c - b * b) / (2 * a);
	   if (Math.abs(n) < 0.00001)
	   {
	   n = 0.00000;
	   }
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",n,m,n,m);
		}
	   i = i + 1;
		}

	}

}

