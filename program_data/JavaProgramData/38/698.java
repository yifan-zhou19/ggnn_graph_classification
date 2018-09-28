package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int n;
	   int i;
	   int j;
	   int t;
	 double[] x = new double[100];
	 double S;
	 double sum2;
	 double sum1;
	 double aver1;
	 double aver2;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < k;i++)
	   {
		 sum1 = 0.0,aver1 = 0.0;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   for (j = 0;j < n;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   x[j] = Double.parseDouble(tempVar3);
			   }
			   sum1 += x[j];
		   }
		   aver1 = (double)sum1 / n;
		   sum2 = 0.0,aver2 = 0.0;
		   for (t = 0;t < n;t++)
		   {

			   sum2 += (x[t] - aver1) * (x[t] - aver1);

		   }
		   aver2 = (double)sum2 / n;
	   S = (double)Math.sqrt(aver2);
	System.out.printf("%.5f\n",S);
	   }
	return 0;
	}


}

