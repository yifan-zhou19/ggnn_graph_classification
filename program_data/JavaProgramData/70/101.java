package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int a;
	   int b;
	  double[] x = new double[10];
	  double[] y = new double[10];
	  double totle = 0;
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
				   x[i] = Double.parseDouble(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   y[i] = Double.parseDouble(tempVar3);
			   }
		   }
		   for (a = 0;a < n;a++)
		   {
			   for (b = 0;b < n;b++)
			   {
				   if ((x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]) > totle)
				   {
					   totle = ((x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]));
				   }
			   }
		   }
		System.out.printf("%.4f\n",Math.pow(totle,0.5));
		return 0;
	}
}

