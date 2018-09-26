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
		 double a;
		 double b;
		 double c;
		 double p;
		 double x1;
		 double x2;
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
			if (p > 0)
			{
			x1 = (-b + Math.sqrt(p)) / (2 * a);
			x2 = (-b - Math.sqrt(p)) / (2 * a);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (p == 0)
			{
				 x2 = x1 = (-b + Math.sqrt(p)) / (2 * a);
				 System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				x1 = (-b) / (2 * a);
				x2 = (Math.sqrt(-p)) / (2 * a);
			   if (x1 == -0)
			   {
			   x1 = 0;
			   }
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
			}
		 }
	}

}

