package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		float a;
		float b;
		float c;
			 double z;
			 double x;
			 double y;
			 double d;
			 double e;
			 double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
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
			z = b * b - 4 * a * c;
			if (z > 0)
			{
			x = (-b + Math.sqrt(z)) / (2 * a);
					  if (x < 0.0001 && x>-0.0001)
					  {
						  x = 0.00000;
					  }
			y = (-b - Math.sqrt(z)) / (2 * a);
			System.out.printf("x1=%.5f;x2=%.5f\n",x,y);
			};
			if (z == 0)
			{
			f = (-b) / (2 * a);
			System.out.printf("x1=x2=%.5f\n",f);
			};
			if (z < 0)
			{
			d = Math.sqrt(-z) / (2 * a);
					  if (b == 0F)
					  {
						  e = 0;
					  }
			if (b != 0F)
			{
				e = (-b) / (2 * a);
			}
					  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,d,e,d);
			};
		}
	}
}

