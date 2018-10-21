package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double y;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
		y = b * b - 4 * a * c;

			if (a == 0)
			{
			System.out.print("error\n");
			}
			else
			{
				if (b == 0)
				{
					if (y > 0)
					{
						   x1 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						x2 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
					}
					else
					{
						 if (y == 0)
						 {
							 x1 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						  x2 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						  System.out.printf("x1=x2=%.5f\n",x1);
						 }
						else
						{
						   z = Math.sqrt(-y) / (2 * a);
					   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,z,b,z);
						}
					}
				}
				else
				{
					 if (y > 0)
					 {
					   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
					 }
				 else
				 {
					   if (y == 0)
					   {
						   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						System.out.printf("x1=x2=%.5f\n",x1);
					   }
					else
					{
							x1 = (-b) / (2 * a);
						 x2 = (-b) / (2 * a);
						 z = Math.sqrt(-y) / (2 * a);
						 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,z,x2,z);
					}
				 }
				}
			}
		}

		return 0;
	}

}

