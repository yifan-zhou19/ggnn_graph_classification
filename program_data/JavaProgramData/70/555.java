package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = 0;
		int i = 0;
		int j = 0;
		int k;
		int t;
		int r = 0;
		int h;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] b = new double[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   j = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < j;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   x[i] = Double.parseDouble(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   y[i] = Double.parseDouble(tempVar3);
	   }

	   }




		for (k = 0;k < j;k++)

		{
		   for (i = 0;i < j;i++)
		   {
			  b[r] = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]));
			   r++;
		   }
		}



	for (k = 0;k < r - 1;k++)

	{
		   for (i = 0;i < r - k - 1;i++)
		   {
			   if (b[i] < b[i + 1])
			   {
				   t = b[i];
				  b[i] = b[i + 1];
				  b[i + 1] = t;

			   }
		   }

	}



	System.out.printf("%.4lf",b[0]);






	}
}

