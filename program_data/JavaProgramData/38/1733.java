package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   double[] a = new double[n];
		   for (j = 0;j < n;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[j] = Double.parseDouble(tempVar3);
			   }
		   }
		   double x = 0;
		   double y = 0;
		   for (j = 0;j < n;j++)
		   {
			 x = x + a[j];
		   }
		   x = x / n;
		   for (j = 0;j < n;j++)
		   {
			 y = y + (a[j] - x) * (a[j] - x);
		   }
		   y = Math.sqrt(y / n);
		   System.out.printf("%.5lf\n",y);
	}
		  return 0;
	}
}

