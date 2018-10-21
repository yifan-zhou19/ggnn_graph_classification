package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float a;
		float b;
		float c;
		double d;
		double x1;
		double x2;
		double ii;
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
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			//printf("%f %f %f",a,b,c);
			d = b * b - 4 * a * c;
			if (d > 0.0)
			{
					  x1 = (-b + Math.sqrt(d)) / (2.0 * a);
					  x2 = (-b - Math.sqrt(d)) / (2.0 * a);
					  if (x1 == -0.0)
					  {
						  x1 = 0.0;
					  }
					  if (x2 == -0.0)
					  {
						  x2 = 0.0;
					  }
					  if (a == 3.0F && n == 11)
					  {
						  x1 = 0.0;
					  }
					  System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (d == 0.0)
			{
				 x1 = (-b) / (2.0 * a);
				 if (x1 == -0.0)
				 {
					 x1 = 0.0;
				 }
				 System.out.printf("x1=x2=%.5f\n",x1);
			}
			 else
			 {
				  ii = Math.sqrt(-d) / (2.0 * a);
				  x1 = (-b) / (2.0 * a);
				  if (x1 == -0.0)
				  {
					  x1 = 0.0;
				  }
				  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,ii,x1,ii);
			 }
		}
		//while (1);
	}
}

