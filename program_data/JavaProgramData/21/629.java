package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int m;
	   double sum = 0;
	   double av = 0;
	   double[] b = new double[1000];
	   double temp1;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = new int[1000];
	   int temp2;
	   for (i = 0;i <= n - 1;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   sum = sum + a[i];
	   }
	   av = sum / n;
	   for (i = 0;i <= n - 1;i++)
	   {
		   b[i] = Math.abs(a[i] - av);
	   }
	   for (i = 0;i <= n - 2;i++)
	   {
		   for (j = 0;j <= n - 2 - i;j++)
		   {
			  if (b[j] < b[j + 1])
			  {
				  temp1 = b[j];
				  b[j] = b[j + 1];
				  b[j + 1] = temp1;
				  temp2 = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = temp2;
			  }
		   }
	   }
		  for (i = 0;i <= n - 1;i++)
		  {
		  if (b[0] != b[i])
		  {
			  m = i;
			  break;

		  }
		  }
		  System.out.print(a[0]);
		  for (i = 1;i <= m - 1;i++)
		  {
			  System.out.print(",");
			  System.out.print(a[i]);
		  }
		  return 0;


	}

}

