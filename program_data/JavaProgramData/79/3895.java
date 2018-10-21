package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  for (int i = 0;i < 100;i++)
		  {
					   int n;
					   int m;
					   int j;
					   int p;
					   String tempVar = ConsoleInput.scanfRead();
					   if (tempVar != null)
					   {
						   n = Integer.parseInt(tempVar);
					   }
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   p = Integer.parseInt(tempVar2);
					   }
					   int[] a = new int[1000];
					   int[] b = new int[1000];
					   a[0] = 0;
					   b[0] = 0;
					   m = p;
					   if (n == 0 && m == 0)
					   {
						   return 0;
					   }
					   else
					   {
						   for (j = 1;j <= n;j++)
						   {
						   a[j] = j;
						   }
						   int k;
						   for (k = n;k > 0;k--)
						   {
										   if (p > k)
										   {
										   m = p % k;
										   }
										   for (j = 1;j < k;j++)
										   {
															if (m + j <= k)
															{
															b[j] = a[m + j];
															}
															else
															{
															b[j] = a[m + j - k];
															}
										   }
										   for (int m = 1;m <= k - 1;m++)
										   {
										   a[m] = b[m];
										   }
						   }
						   System.out.printf("%d\n",a[1]);
					   }
		  }
	}

}

