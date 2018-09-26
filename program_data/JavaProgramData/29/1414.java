package <missing>;

public class GlobalMembers
{
	public static double fs(int n)
	{
		   int f = 0;
		   if (n == 1)
		   {
		   f = 1;
		   }
		   else
		   {
		   if (n == 2)
		   {
		   f = 2;
		   }
		   else
		   {
		   f = fs(n - 1) + fs(n - 2);
		   }
		   }
		   return f;
	}
	public static int Main()
	{
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (int j = 0;j < m;j++)
		  {
				  int n;
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  n = Integer.parseInt(tempVar2);
				  }
		  double[] a = new double[n];
		  double sum = 0;
		  int i;
		  for (i = 0;i < n;i++)
		  {
							a[i] = (fs(i + 2)) / (fs(i + 1));
							sum += a[i];
		  }
							System.out.printf("%.3lf\n",sum);
		  }
	}

}

