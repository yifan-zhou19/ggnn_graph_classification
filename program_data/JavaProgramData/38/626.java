package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int a;
		int n;
		int i;
		double[][] x = new double[100][1000];
		double sum1;
		double sum2;
		double pj;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (a = 0;a < k;a++)
		{
			sum1 = 0;
			pj = 0;
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   n = Integer.parseInt(tempVar2);
				   }
				   for (i = 0;i < n;i++)
				   {
											 String tempVar3 = ConsoleInput.scanfRead();
											 if (tempVar3 != null)
											 {
												 x[a][i] = Double.parseDouble(tempVar3);
											 }


					   sum1 += x[a][i];
				   }
				   pj = (double)sum1 / n;
				   sum2 = 0;
				   for (i = 0;i < n;i++)
				   {
				   sum2 += (double)(x[a][i] - pj) * (x[a][i] - pj);
				   }
				   s = Math.sqrt(sum2 / n);
				   System.out.printf("%.5f\n",s);

		}



		return 0;
	}


}

