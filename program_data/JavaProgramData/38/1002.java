package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int n;
	   int i;
	   int j;
	   double sum1;
	   double sum2;
	   double[] r = new double[100];
	   double[] a = new double[100];
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
		   sum1 = 0;
		   for (j = 0;j < n;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[j] = Double.parseDouble(tempVar3);
			   }
			   sum1 += a[j];
		   }
		   sum1 = sum1 / n;
		   sum2 = 0;
		   for (j = 0;j < n;j++)
		   {
			   sum2 += (a[j] - sum1) * (a[j] - sum1);
		   }
		   r[i] = Math.sqrt(sum2 / n);
	   }
	   for (i = 0;i < k;i++)
	   {
		  System.out.printf("%.5f\n",r[i]);
	   }
	return 0;
	}

}

