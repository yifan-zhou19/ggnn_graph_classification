package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int tmp;
		for (s = 0;s < 100;s++)
		{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n = Integer.parseInt(tempVar);
			   }
			   if (n == 0)
			   {
				   break;
			   }
			   int[] a = new int[1000];
			   int[] b = new int[1000];
			   int i;
			   int j;
			   int k;
			   int r;
			   for (i = 0;i < n;i++)
			   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
			   }
			   for (i = 0;i < n;i++)
			   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
			   }
			   for (j = n - 1;j > 0;j--)
			   {
						  for (r = 0;r < j;r++)
						  {
										  if (a[r] > a[r + 1])
										  {
														 tmp = a[r + 1];
														 a[r + 1] = a[r];
														 a[r] = tmp;
										  }
										  if (b[r] > b[r + 1])
										  {
														 tmp = b[r + 1];
														 b[r + 1] = b[r];
														 b[r] = tmp;
										  }
						  }
			   }
			   int m = 0;
			   for (i = 0;i < n;i++)
			   {
							   if (a[i] > b[i])
							   {
								   m++;
							   }
							   if (a[i] < b[i])
							   {
											 m--;
											 for (j = n - 1;j > i;j--)
											 {
											 b[j] = b[j - 1];
											 }
											 continue;
							   }
							   if (a[i] == b[i])
							   {
											 for (k = n - 1;k > i;k--)
											 {
															   if (a[k] > b[k])
															   {
																   m++;
																   n--;
																   continue;
															   }
															   else
															   {
																			if (a[i] == a[k])
																			{
																				continue;
																			}
																			m--;
																			for (r = k;r > i;r--)
																			{
																			b[r] = b[r - 1];
																			}
																			n = k + 1;
																			break;
															   }
											 }
							   }
			   }

			   System.out.printf("%d\n",200 * m);
		}
		System.in.read();
		System.in.read();
	}
}

