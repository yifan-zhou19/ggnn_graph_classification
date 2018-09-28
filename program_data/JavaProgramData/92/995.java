package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[2000];
	  int[] b = new int[2000];
	  int n;
	  int i;
	  int x = 0;
	  int k;
	  int j;
	  int m = 0;
	  int count = 0;
	  int order1;
	  int order2;
	  int s1 = 1;
	  int s2 = 1;
	  int s;
	  for (s = 1;s <= 50;s++)
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
			else
			{
			   for (i = 1;i <= n;i++)
			   {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
			   }
			 for (i = 1;i <= n;i++)
			 {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
			 }


											   for (k = 1;k <= n - 1;k++)
											   {
												 for (j = 1;j <= n - k;j++)
												 {
													 if (a[k] >= a[k + j])
													 {
														 ;
													 }

													 else if (a[k] < a[k + j])
													 {
														m = a[k];
														a[k] = a[k + j];
														a[k + j] = m;
													 }
												 }
											   }
													for (k = 1;k <= n - 1;k++)
													{
												 for (j = 1;j <= n - k;j++)
												 {
													 if (b[k] >= b[k + j])
													 {
														 ;
													 }

													 else if (b[k] < b[k + j])
													 {
														m = b[k];
														b[k] = b[k + j];
														b[k + j] = m;
													 }
												 }
													}
			order1 = n;
			order2 = n;
		   for (i = 1;;i++)
		   {
						 if (count == n)
						 {
							 break;
						 }
						   if (a[s1] > b[s2])
						   {
								 x = x + 200;
								 s1++;
								 s2++;
								 count++;
								 continue;
						   }
						   else if (a[s1] <= b[s2])
						   {
										  if (a[order1] > b[order2])
										  {
											 order1--;
											 order2--;
											 count++;
											 x = x + 200;
											 continue;
										  }
										  else if (a[s1] == b[s2] && a[order1] == b[order2] && a[s1] == a[order1])
										  {
											 break;
										  }
										  else if (a[order1] <= b[order2])
										  {
											  s2++;
											  order1--;
											  count++;
											  x = x - 200;
											  continue;
										  }

						   }

		   }


		   System.out.printf("%d\n",x);
		   x = 0;
		   count = 0;
		   m = 0;
		   s1 = 1;
		   s2 = 1;
			}


	  }
	}
}

