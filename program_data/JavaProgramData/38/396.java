package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int k;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < k;i++)
	 {
	   int n;
	   int j;
	   double[] x = new double[100];
	   double sum = 0;
	   double aver;
	   double b;
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
		sum += x[j];
	   }
	   aver = sum / n;
	   double a = 0;
	   for (j = 0;j < n;j++)
	   {

		a += (x[j] - aver) * (x[j] - aver);
	   }
	   b = Math.sqrt(a / n);
	   System.out.printf("%.5lf\n",b);
	 }



	}


}

