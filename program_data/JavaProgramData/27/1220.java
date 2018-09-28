package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a = 0;
		double b = 0;
		double c = 0;
		for (;n > 0;n--)
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

	   double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   if ((b * b - 4 * a * c) > 0)
	   {
		   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	   }
		else if ((b * b - 4 * a * c) == 0)
		{
		   System.out.printf("x1=x2=%.5f\n",x2);
		}
	   else if ((b * b - 4 * a * c) < 0)
	   {

		   if (b != 0)
		   {
		   double c1;
		   double d1;
		   double d2;
			   c1 = (-b / (a * 2.0));
			   d1 = Math.sqrt(4 * a * c - b * b) / (2 * a);
			   d2 = -d1;
			  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",c1,d1,c1,d2);
		   }
		else if (b == 0)
		{
		double c2;
		double d3;
		double d4;
		c2 = 0;
		d3 = Math.sqrt(4 * a * c - b * b) / (2 * a);
			   d4 = -d3;
		System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",c2,d3,c2,d4);
		}
	   }
		};

	}


}

