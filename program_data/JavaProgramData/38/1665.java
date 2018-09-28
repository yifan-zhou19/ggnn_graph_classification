package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int kk;
		for (kk = 1; kk <= k; kk++)
		{
			   int n;
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   n = Integer.parseInt(tempVar2);
			   }

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *data = (double *) malloc(sizeof(double) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   double data = (double) malloc((Double.SIZE / Byte.SIZE) * n);

			   int i;
			   double sum = 0;

			   for (i = 0; i <= n - 1; i++)
			   {
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 data + i = Double.parseDouble(tempVar3);
					 }
					 sum = sum + *(data + i);
			   }


			   double mean = sum / (1.0 * n);

			   double total = 0;
			   for (i = 0; i <= n - 1; i++)
			   {
					 total = total + Math.pow(*(data + i) - mean, 2);
			   }

			   total = Math.sqrt(total / (1.0 * n));
			   System.out.printf("%.5f\n", total);
		}


		return 0;
	}


}

