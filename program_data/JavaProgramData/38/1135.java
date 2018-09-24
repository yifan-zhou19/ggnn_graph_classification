package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   double s;
	   double a;
	   double b;
	   double c;
	   double d;
	   double e;
	   double[] x = new double[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   s = 0;
		   a = 0;
		   d = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		   for (j = 0;j < m;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   x[j] = Double.parseDouble(tempVar3);
			   }
			   a = a + x[j];
		   }
		   b = (a / m);
		   for (j = 0;j < m;j++)
		   {
			   c = Math.pow((x[j] - b),2);
			   d = d + c;

		   }
		   e = d / m;
		   s = Math.sqrt(e);
		   System.out.printf("%.5lf\n", s);
	   }
	   return 0;
	}

}

