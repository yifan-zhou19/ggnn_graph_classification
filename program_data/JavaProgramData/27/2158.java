package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double f;
		double g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (e = 1;e <= n;e++)
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
		   if ((b * b) > (4 * a * c))
		   {
			   x1 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (0 - b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		   }
			else if ((b * b) < (4 * a * c))
			{
				f = (0 - b) / (2 * a);
			 g = (Math.sqrt((4 * a * c) - (b * b))) / (2 * a);
			 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",f,g,f,g);
			}
			else
			{
				x1 = (0 - b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
			 System.out.printf("x1=x2=%.5f\n",x1);
			}
		}

	}

}

