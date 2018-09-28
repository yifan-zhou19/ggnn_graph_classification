package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   double[] a = new double[1000];
	   double[] b = new double[1000];
	   double[] c = new double[1000];
	   int q;
	   double x1;
	   double x2;
	   for (q = 0;q < n;q++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[q] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[q] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c[q] = Double.parseDouble(tempVar4);
		}
	   }

		for (q = 0;q < n;q++)
		{
			double d = b[q] * b[q] - 4 * a[q] * c[q];
			if (d > 0)
			{
				x1 = (-b[q] + Math.sqrt(d)) / (2 * a[q]);
				x2 = (-b[q] - Math.sqrt(d)) / (2 * a[q]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (d == 0)
			{
				x1 = (-b[q]) / (2 * a[q]);
				x2 = (-b[q]) / (2 * a[q]);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f%.5fi\n",-b[q] / (2 * a[q]),Math.sqrt(-d) / (2 * a[q]),-b[q] / (2 * a[q]),- Math.sqrt(-d) / (2 * a[q]));
			}
		}
	}

}

