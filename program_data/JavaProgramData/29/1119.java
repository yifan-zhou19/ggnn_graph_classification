package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		   int n;
		   int i;
		   int j;
		   int[] a = new int[100];
		   int k;
		   int b = 2;
		   int c = 1;
		   double[] sum = new double[100];
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   }
	  for (i = 0;i < n;i++)
	  {
		  sum[i] = 0;
	  }
		   for (i = 0;i < n;i++)
		   {
				   b = 2;
				  c = 1;
				for (j = 0;j < a[i];j++)
				{

						 sum[i] = sum[i] + (1.0 * b / c);
								k = c;
								c = b;
								b = b + k;
				}
		   }
		   for (i = 0;i < n - 1;i++)
		   {
				  System.out.printf("%.3lf\n",sum[i]);
		   }
	 System.out.printf("%.3lf",sum[n - 1]);
			return 0;
	}

}

