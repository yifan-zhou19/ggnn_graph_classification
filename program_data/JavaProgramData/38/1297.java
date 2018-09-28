package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double s;
		double[] x = new double[1000];
		double pingjun;
		double he;
		double sum;
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
		   sum = 0.00;
		   for (j = 0;j < n;j++)
		   {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 x[j] = Double.parseDouble(tempVar3);
			 }
			 sum += (double)x[j];
		   }
		   pingjun = (double)sum / n;
		   he = 0.00;
		   for (j = 0;j < n;j++)
		   {
			  he += (double)(x[j] - pingjun) * (x[j] - pingjun);
		   }
		   s = (double)Math.sqrt(he / n);
		   System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

