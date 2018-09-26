package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int k;
	   double sum = 0;
	   double SUM = 0;
	   double a;
	   double[] x = new double[1000];
	   double S;
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
		sum = 0;
		 for (j = 0;j < n;j++)
		 {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x[j] = Double.parseDouble(tempVar3);
		}
		 sum += x[j];
		 }
		 a = (double)sum / n;
		 SUM = 0;
		 for (j = 0;j < n;j++)
		 {
		 SUM += (x[j] - a) * (x[j] - a);
		 }
		 S = Math.sqrt(SUM / n);
		 System.out.printf("%.5lf\n",S);
	   }
	   return 0;
	}


}

