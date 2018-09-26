package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   double[] fib = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	   int m;
	   int i;
	   int j;
	   double sum = 0.00;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }

	   for (i = 1;i <= m;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }

	   fib[1] = 1.0;

	   for (i = 2;i <= 99;i++)
	   {
		   fib[i] = fib[i - 1] + fib[i - 2];
	   }

	   for (i = 1;i <= m;i++)
	   {
		  for (j = 1;j <= a[i];j++)
		  {
			sum = sum + fib[j + 2] / fib[j + 1];
		  }
		  System.out.printf("%.3f\n",sum);
		  sum = 0;
	   }






	return 0;
	}
}

