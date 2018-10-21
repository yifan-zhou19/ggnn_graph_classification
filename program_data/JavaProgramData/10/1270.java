package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[25];
		  int[] b = new int[25];
		  int i;
		  int j;
		  int max;
		  int s;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
						  b[i] = 0;
		  }


		  for (i = n - 1;i >= 0;i--)
		  {
							 max = 0;
							 for (j = i;j < n;j++)
							 {
											 if (a[j] <= a[i])
											 {
														   s = b[j] + 1;
														   if (s >= max)
														   {
															   max = s;
														   }
											 }
							 }
							 b[i] = max;
		  }
		  max = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (b[i] >= max)
						  {
							  max = b[i];
						  }
		  }
		  System.out.printf("%d",max);
	}
}

