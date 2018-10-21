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
		int j;
		for (j = 1;j <= n;j++)
		{
			double a1;
			double b1;
			double c1;
			double x1;
			double x2;
			double m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a1 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b1 = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c1 = Double.parseDouble(tempVar4);
			}
			 m = b1 * b1 - 4 * a1 * c1;
			 if (m > 0)
			 {
			x1 = (-b1 + Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
			x2 = (-b1 - Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			 }
			 if (m == 0)
			 {
				 x1 = (-b1) / (2 * a1);
				System.out.printf("x1=x2=%.5f\n",x1);
			 }
		   if (m < 0)
		   {
		   double y1;
		   double y2;
		   y1 = (-b1) / (2 * a1);
		   y2 = (Math.sqrt(-m)) / (2 * a1);
		  if (b1 == 0.00000)
		  {
		   System.out.printf("x1=%.5f+%.5fi;",-y1,y2);
		   System.out.printf("x2=%.5f-%.5fi\n",-y1,y2);
		  }
		   else
		   {
			   System.out.printf("x1=%.5f+%.5fi;",y1,y2);
		   System.out.printf("x2=%.5f-%.5fi\n",y1,y2);
		   }
		   }

		}

		return 0;
	}

}

